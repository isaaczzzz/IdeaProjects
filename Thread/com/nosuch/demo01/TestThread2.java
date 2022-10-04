package com.nosuch.demo01;

//创建线程方法2: 实现Runnable接口，重写run()方法，执行线程时将runnable实现类丢进Thread线程，调用start()方法
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            System.out.println("run方法" + i);
        }
    }

    public static void main(String[] args) {
        TestThread2 testThread2 = new TestThread2();

        //开启线程
        new Thread(testThread2).start();

        for(int i = 0; i < 20; i++) {
            System.out.println("主线程" + i);
        }
    }
}
