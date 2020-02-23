package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int value, int max) throws CounterException {
        super(value);
        this.max = max;
        if(value>max || value<0) {
            throw new CounterException("La valeur est soit inférieur à 0 soit est supérieur à la valeur maximale");
        }
    }


}
