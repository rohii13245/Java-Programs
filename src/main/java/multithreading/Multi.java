package multithreading;

public class Multi implements Runnable {

    public static void main(String[] args) {
        Multi t2 = new Multi();
        Thread t3 = new Thread(t2);
        InitiateThread t4 = new InitiateThread();
        t3.start();
        t4.run();

    }

    @Override
    public void run() {
        System.out.println("thread is overloaded:");
    }
}
