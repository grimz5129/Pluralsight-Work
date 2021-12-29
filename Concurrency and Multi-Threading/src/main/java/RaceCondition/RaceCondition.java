package RaceCondition;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
/** This uses 1 thread
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = () -> {

            for(int i = 0; i < 1_000; i++){
                longWrapper.incrementValue();
            }
        };

        Thread t = new Thread(r);
        t.start();

        t.join();

        System.out.println("value = " + longWrapper.getValue());
**/

        // This should return 1million but varies to fix this go to LongWrapper


        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = () -> {

            for(int i = 0; i < 1_000; i++){
                longWrapper.incrementValue();
            }
        };

        Thread[] threads = new Thread[1_000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++){
            threads[i].join();
        }

        System.out.println("value = " + longWrapper.getValue());


    }

}
