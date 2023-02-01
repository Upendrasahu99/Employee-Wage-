package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {
    public static void calculateEmployeeWage(){
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int wagePerHour = 20;
        int fullDayHour = 8;                                   //Full day working-hour
        int fullDayWage = wagePerHour * fullDayHour;           //Daily wage
        int partTimeHour = 4;                                  //Part-time working-hour
        int partTimeWage = wagePerHour * partTimeHour;         //Daily wage
        int absentHour = 0;
        int perMonthWorkingDay = 20;
        int absentDayCount = 0;
        int fullDayCount = 0, totalFullDayWorkingHour = 0;//Full day count and Full day working-hour count
        int partTimeDayCount = 0, totalPartTimeWorkingHour = 0;//Part-time day count and Part time working-hour count
        for (int i = 1; i <= perMonthWorkingDay; i++) {
            System.out.print("Day " + i);
            int a = random.nextInt(3);
            switch (a) {
                case 0:
                    System.out.println(" Working-hour = " + absentHour);
                    absentDayCount++;
                    break;
                case 1:
                    System.out.println(" Working-hour = " + fullDayHour);
                    fullDayCount++;
                    totalFullDayWorkingHour += fullDayHour;
                    break;
                default:
                    System.out.println(" Working-hour = " + partTimeHour);
                    partTimeDayCount++;
                    totalPartTimeWorkingHour+= partTimeHour;

            }
            int totalWorkingHour = (totalFullDayWorkingHour + totalPartTimeWorkingHour);//Total Working-hour in month
            int totalPresentDay=(fullDayCount+partTimeDayCount);//Total Present day
            int totalDay = (absentDayCount + fullDayCount + partTimeDayCount);
            if (totalWorkingHour >= 100 ) {
                System.out.println("Total Employee Wage   = " + (100 * 20));
                System.out.println("Total Working Hour    = " + totalWorkingHour);
                System.out.println("Total Day Present day = " + totalPresentDay);
                break;

            } else if (totalDay == 20) {
                System.out.println("Total Employee Wage   = " + totalWorkingHour * 20);
                System.out.println("Total Working Hour    = " + totalWorkingHour);
                System.out.println("Total Day Present day = " + totalPresentDay);
                break;
            }
        }
    }

    public static void main(String[] args) {
        calculateEmployeeWage();
    }
}