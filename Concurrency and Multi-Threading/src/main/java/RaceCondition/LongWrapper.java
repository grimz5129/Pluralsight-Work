package RaceCondition;

public class LongWrapper {
    // a new object is created called key
    private Object key = new Object();

    //tried making this volatile long but didn't fix anything
    private long l;

    public LongWrapper(long l) {
        this.l = l;
    }

    //There wasn't a before link because this was not synchronized, needs the read and write to be sync.
    public long getValue() {
        synchronized (key) {
            return l;
        }
    }

    //synchronized the incrementValue method with the key
    public void incrementValue() {
        //for volatile had to comment out the key stuff
        synchronized (key) {
            l = l + 1;
        }
    }


}
