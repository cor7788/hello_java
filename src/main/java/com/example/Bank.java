package com.example;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private double[] accounts;
    private Lock mLock;
    private Condition sufficientFunds;

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        mLock = new ReentrantLock();
        sufficientFunds = mLock.newCondition();
    }

    public void transfer(int fromAccount, int toAccount, double money) throws InterruptedException {
        mLock.lock();
        try {
            while(accounts[fromAccount] < money)
                sufficientFunds.await();
            System.out.println(Thread.currentThread());
            accounts[fromAccount] -= money;
            System.out.printf("%10.2f from %d to %d", money, fromAccount, toAccount);
            accounts[toAccount] += money;
            System.out.printf("Total balance is: %10.2f", getTotalBalance());
            sufficientFunds.signalAll();
        } finally {
            mLock.unlock();
        }

    }

    private double getTotalBalance() {
        mLock.lock();
        try {
            double total = 0;
            for (double account : accounts) {
                total += account;
            }
            return total;
        } finally {
            mLock.unlock();
        }

    }

    public int size() {
        return accounts.length;
    }
}
