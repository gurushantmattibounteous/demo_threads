import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread_pool {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int taskNumber = i;

            service.submit(() -> {
                System.out.println(
                        Thread.currentThread().getName() +
                                " executing task " + taskNumber
                );
            });
        }

        service.shutdown();
    }
}