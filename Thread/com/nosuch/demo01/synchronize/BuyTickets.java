package com.nosuch.demo01.synchronize;

public class BuyTickets {
    public static void main(String[] args) {
        BuyTicket ticket = new BuyTicket();
        new Thread(ticket, "A").start();
        new Thread(ticket, "B").start();
        new Thread(ticket, "C").start();
    }
}

class BuyTicket implements Runnable {
    private int ticketNums = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(100);
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void buy() throws InterruptedException {
        if (ticketNums <= 0) {
            flag = false;
            return;
        }
        //Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"->拿到了第"+ticketNums--+"张票");
    }
}