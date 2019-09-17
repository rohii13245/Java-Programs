package multithreading;

public class SampleThread {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println("thread is starting:");
        SampleThread t1 = new SampleThread();
        t1.run();
    }

    public void run() {
        while (SampleThread.count <= 10) {

            try {

                System.out.println("my thread is:" + (++SampleThread.count));
                Thread.sleep(200);

            } catch (InterruptedException e) {
                System.out.println("interrupted exception is:" + e.getMessage());
            }
        }
    }
}
