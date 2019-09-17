package multithreading;

public class DifferentClsThreads extends Thread {
    public static int count = 0;

    public void run() {
        while (DifferentClsThreads.count <= 10) {
            try {
                System.out.println("my thread:" + (++DifferentClsThreads.count));
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("interrupted thread occur:" + e.getMessage());
            }

        }
    }

}


