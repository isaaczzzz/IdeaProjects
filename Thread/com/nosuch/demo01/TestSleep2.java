package com.nosuch.demo01;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
//打印当前时间
public class TestSleep2{

    public static void main(String[] args) throws InterruptedException {
        //tenDown();
        currentTime();
    }

    //当前时间
    public static void currentTime() {
        Date time = new Date(System.currentTimeMillis());
        while(true) {
            try {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(time));
                Thread.sleep(1000);
                time = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    //倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;
        do {
            System.out.println(num--);
            Thread.sleep(1000);
        } while (num > 0);
    }
}
