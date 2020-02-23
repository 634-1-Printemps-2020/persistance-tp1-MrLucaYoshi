package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int value;

    public Counter(int value) throws CounterException {
        this.value = value;
    }

    @Override
    public void inc() throws CounterException {
        value++;
    }

    @Override
    public void add(int step) throws CounterException {
        value += step;
    }

    @Override
    public int getValue() {
        return value;
    }
}
