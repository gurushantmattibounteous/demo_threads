import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class producercon_using_blockingQ {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    queue.put(value++);
                    System.out.println("Produced: " + value);
                    Thread.sleep(500); // slow down for visibility
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int data = queue.take();
                    System.out.println("Consumed: " + data);
                    Thread.sleep(1000); // slow down for visibility
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}