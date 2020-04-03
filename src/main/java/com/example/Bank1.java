package com.example;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank1 {
    private double[] accounts;

    public Bank1(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int fromAccount, int toAccount, double money)
            throws InterruptedException {
        while (accounts[fromAccount] < money)
            wait();
        System.out.println(Thread.currentThread());
        accounts[fromAccount] -= money;
        System.out.printf("%10.2f from %d to %d", money, fromAccount, toAccount);
        accounts[toAccount] += money;
        System.out.printf("Total balance is: %10.2f", getTotalBalance());
        notifyAll();
    }

    private synchronized double getTotalBalance() {
        double total = 0;
        for (double account : accounts) {
            total += account;
        }
        return total;
    }

    public int size() {
        return accounts.length;
    }
}
