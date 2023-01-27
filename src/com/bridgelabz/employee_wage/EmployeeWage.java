package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int a = random.nextInt(3);
        switch (a) {
            case 0:
                System.out.println("Employee is absent");
                break;
            case 1:
                System.out.println("Employee is present for full day than daily wage  = " + wagePerHour * fullDayHour);
                break;
            default:
                System.out.println();
                System.out.println("Employee is present for part time than daily wage = " + wagePerHour* partTimeHour);

        }
    }

}