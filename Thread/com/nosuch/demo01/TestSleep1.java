package com.nosuch.demo01;

//模拟网络延时，放大问题的发生性
public class TestSleep1 implements Runnable{
    private int ticketNum = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0)
                break;
            //模拟网络延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNum-- + "张票");
        }
    }

    public static void main(String[] args) {
        TestSleep1 tickets = new TestSleep1();

        new Thread(tickets, "A").start();
        new Thread(tickets, "B").start();
        new Thread(tickets, "C").start();
    }
}
