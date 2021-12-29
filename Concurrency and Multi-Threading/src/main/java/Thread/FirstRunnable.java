package Thread;

public class FirstRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread");
        t.start(); // Always use this to run a thread
//        t.run(); // NO NO NO // this runs in the main
    }
}
