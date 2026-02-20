class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
}

public class runnnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}