class Counter {
    private int count = 1;

    public synchronized void printNumbers() {
        while (count <= 20) {
            System.out.println(Thread.currentThread().getName() + " -> " + count);
            count++;
        }
    }
}