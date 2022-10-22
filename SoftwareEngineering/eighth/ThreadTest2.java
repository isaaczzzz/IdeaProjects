package eighth;

public class ThreadTest2 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        new Thread(sub, "A").start();
        new Thread(sub, "B").start();
    }
}
class Sub implements Runnable {
    public static int a = 10;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notifyAll();
                if (a < 0)
                    return;
                System.out.println(Thread.currentThread().getName()+": "+a);
                a--;
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
