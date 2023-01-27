package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int wagePerHour = 20;
        int fullDayHour = 8;
        int fullDayWage = wagePerHour * fullDayHour;
        int a = random.nextInt(2);
        if (a == 0) {
            System.out.println("Employee is absent");
        } else {
            System.out.println("Employee is present than daily wage  = " + fullDayWage);
        }

    }
}
