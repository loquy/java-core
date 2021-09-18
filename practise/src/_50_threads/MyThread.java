package _50_threads;

public class MyThread extends Thread {

    @Override
    public void run() {

        if(this.isDaemon()) {
            System.out.println("This is a daemon thread is running");
        } else {
            System.out.println("This is a user thread that is running");
        }
    }
}
