package eighth;

public class ThreadTest {
    public static int a = 100;

    public static void main(String[] args) {
        new Thread1().start();
        new Thread1().start();
        Runnable1 runnable1 = new Runnable1();
        new Thread(runnable1).start();
        new Thread(runnable1).start();
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ThreadTest.a++;
            System.out.println(ThreadTest.a);
        }
    }
}

class Runnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ThreadTest.a--;
            System.out.println(ThreadTest.a);
        }
    }
}