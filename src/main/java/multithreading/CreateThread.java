package multithreading;

public class CreateThread extends Thread {

    @Override
    public void run() {
        System.out.println("Threat"+" "+Thread.currentThread().getId()+"running thread");
    }

    public static void main(String[] args) {
        int i=1;

        for(i=0;i<10;i++){

            CreateThread th=new CreateThread();
            th.start();
        }
    }
}
