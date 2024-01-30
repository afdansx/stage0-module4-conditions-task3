package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary > 4999 && salary < 5001){
            System.out.println(salary-(salary*0.15));
        } else if(salary > 14999 && salary < 20001){
            System.out.println(salary-(salary*0.18));
        }else if(salary > 20000){
            System.out.println(salary-(salary*0.20));
        } else if(salary < 4999){
            System.out.println("wrong input!");
        }
    }
}
