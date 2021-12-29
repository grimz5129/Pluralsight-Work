package RaceCondition;

public class LongWrapper {
    // a new object is created called key
    private Object key = new Object();

    private long l;

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    //synchronized the incrementValue method with the key
    public void incrementValue() {
        synchronized (key) {
            l = l + 1;
        }
    }


}
