package chat;

import java.util.LinkedList;
import java.util.Queue;

public class Talk {
    public static void main(String[] args) {
        Speak speak = new Speak();
        new Thread(speak, "A").start();
        new Thread(speak, "B").start();
    }
}

class Speak implements Runnable{
    private static final Queue<String> queue = new LinkedList<String>();

    static  {
        queue.add("你是哪个省的");
        queue.add("妈妈生的");
        queue.add("How are you");
        queue.add("I'm fine.Thank you.");
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notifyAll();

                if (queue.isEmpty())
                    return;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName()+"说: "+queue.poll());
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
