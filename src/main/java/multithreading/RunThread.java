package multithreading;

public class RunThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start main thread:");
        DifferentClsThreads dt = new DifferentClsThreads();
        dt.start();

        long starttime=System.currentTimeMillis();
        System.out.println(starttime);
        while (DifferentClsThreads.count <= 10) {

            System.out.println("main thread:" + (++DifferentClsThreads.count));
            Thread.sleep(200);


        }
        long endtime=System.currentTimeMillis();
        System.out.println(endtime);

        long executionTime=(endtime-starttime);
        System.out.println(executionTime);
    }
}

