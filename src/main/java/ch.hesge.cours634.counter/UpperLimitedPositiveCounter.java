package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int value, int max) throws CounterException {
        super(value);
        this.max = max;
        if(value>max || value<0) {
            throw new CounterException("La valeur est soit inférieur à 0 ou est supérieur à la valeur maximale");
        }
    }

    @Override
    public void inc() throws CounterException {
        if(getValue()+1>max) {
            throw new CounterException("La valeur dépasse le maximum");
        }
        super.inc();

    }

    @Override
    public void add(int step) throws CounterException {
        if(getValue()+step>max || step<0) {
            throw new CounterException("La valeur dépasse le maximum ou la valeur a ajouter est inférieure à 0");
        }
        super.add(step);
    }

    @Override
    public int getValue() {
        return super.getValue();
    }
}
