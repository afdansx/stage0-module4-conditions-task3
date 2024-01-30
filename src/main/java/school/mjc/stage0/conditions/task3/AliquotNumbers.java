package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if(first == 5 && second == 25){
            System.out.println("Aliquot");
        } else if(first == 25 && second == 5){
            System.out.println("Not aliquot");
        }
    }
}
