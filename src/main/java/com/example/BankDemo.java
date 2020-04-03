package com.example;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(100, 1000);
        for (int i = 0; i < 100; i++) {
            int fromAccount = i;
            Thread thread = new Thread(() -> {
                try {
                    while (true) {
                        int toAccount = (int) (Math.random() * 100);
                        double money = 1000 * Math.random();
                        bank.transfer(fromAccount, toAccount, money);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
