package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Hello World! Et c'est parti pour test le code !");
            Counter cA = new Counter(1);
            Counter cB = new Counter(-1);
            UpperLimitedPositiveCounter culpcA = new UpperLimitedPositiveCounter(19, 20);
            UpperLimitedPositiveCounter culpB = new UpperLimitedPositiveCounter(20, 19);
            cA.inc();
            cA.add(-1);
            System.out.println(cA.getValue());
            cB.inc();
            cB.add(-1);
            System.out.println(cB.getValue());
            culpcA.inc();
            culpcA.add(2);
            System.out.println(culpcA.getValue());
            culpB.inc();
            culpB.add(3);
            System.out.println(culpB.getValue());
        } catch(CounterException e){
            System.out.println(e);
        }

    }
}
