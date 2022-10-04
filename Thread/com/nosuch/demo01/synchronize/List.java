package com.nosuch.demo01.synchronize;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }
            ).start();
        }
        Thread.sleep(3000);
        System.out.println(list.size());
    }
}
