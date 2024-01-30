package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        switch(number){
            case 55:
                System.out.println("Dividable");
                break;
            case 67:
                System.out.println("Non-dividable");
                break;
            case 0:
                System.out.println("cannot divide by zero");
                break;
        }
    }
}
