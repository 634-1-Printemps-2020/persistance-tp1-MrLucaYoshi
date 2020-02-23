package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int value;

    public Counter(int value) throws CounterException {
        this.value = value;
        /*if(value<0){
            throw new CounterException("Valeur inférieur à 0");
        }*/
    }

    @Override
    public void inc() throws CounterException {
        value++;
    }

    @Override
    public void add(int step) throws CounterException {
        value += step;
        /*if(step<0){
            throw new CounterException("La valeur a ajouter est inférieur à 0");
        }*/
    }

    @Override
    public int getValue() {
        return value;
    }
}
