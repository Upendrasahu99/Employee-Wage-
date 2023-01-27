import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int wagePerHour = 20;
        int fullDayHour = 18;
        int partTimeHour = 6;
        int a = random.nextInt(3);
        if (a == 0) {
            System.out.println("Employee is absent");
        } else if (a == 1) {
            System.out.println("Employee is present full day than daily wage is = " + fullDayHour * wagePerHour);
        } else {
            System.out.println("Employee is present part time than daily wage is = " + partTimeHour * wagePerHour);
        }
    }
}