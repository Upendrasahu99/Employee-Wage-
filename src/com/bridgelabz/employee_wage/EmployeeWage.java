package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int wagePerHour = 20;
        int fullDayHour = 8;
        int fullDayWage = wagePerHour*fullDayHour;//Daily wage
        int partTimeHour = 4;
        int partTimeWage = wagePerHour*partTimeHour;//Daily wage
        int absentHour =0;
        int perMonthWorkingDay = 20;
        int fullDayCount =0;
        int partTimeCount = 0;
        for (int i = 1; i <= perMonthWorkingDay; i++) {
            System.out.print(" Day " + i );
            int a = random.nextInt(3);
            switch (a) {
                case 0:
                    System.out.println(" Employee is absent than day " + i + " Employee wage is " + absentHour);
                    break;
                case 1:
                    System.out.println(" Employee is present for full day " + i + " Employee wage is " + fullDayWage );
                    fullDayCount++;
                    break;
                default:
                    System.out.println(" Employee is present for Part Time " + i + " Employee wage is " + partTimeWage);
                    partTimeCount++;

            }
        }
        System.out.println("Per month wage = "+ ((fullDayCount*fullDayWage)+(partTimeCount*partTimeWage)));
    }
}