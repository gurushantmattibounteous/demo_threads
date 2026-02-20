import java.util.concurrent.ThreadPoolExecutor;

public class demo_mt {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            counter.printNumbers();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            counter.printNumbers();
        }, "Thread-2");

        t1.start();
        t2.start();


    }

}