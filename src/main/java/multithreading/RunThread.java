package multithreading;

public class RunThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start main thread:");
        DifferentClsThreads dt = new DifferentClsThreads();
        dt.start();

        while (DifferentClsThreads.count <= 10) {

            System.out.println("main thread:" + (++DifferentClsThreads.count));
            Thread.sleep(200);


        }
    }
}

