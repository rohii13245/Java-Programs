package multithreading;

public class InitiateThread extends Thread {

    public static void main(String[] args) {
        InitiateThread t1 = new InitiateThread();

        t1.run();

    }

    public void run() {
        System.out.println("thread is running");
    }

}
