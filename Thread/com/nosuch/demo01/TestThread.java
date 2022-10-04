package com.nosuch.demo01;

//创建线程方式 1: 继承Thread类，重写run()方法，调用start()开线程
public class TestThread extends Thread{

    //run()方法线程体
    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            System.out.println("run方法" + i);
        }
    }
    //主线程
    public static void main(String[] args) {

        TestThread testThread1 = new TestThread();
        testThread1.start();

        for(int i = 0; i < 20; i++) {
            System.out.println("主线程" + i);
        }
    }
}
