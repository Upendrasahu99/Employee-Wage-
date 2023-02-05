package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {
    public static void calculateEmployeeWage(String companyName, int wagePerHour,  int perMonthWorkingDay, int perMonthWorkingHour){
        System.out.println();
        System.out.println();
        System.out.println("Welcome to Employee Wage Computation Program  ");
        System.out.println("--------" + companyName + "--------");
        Random random = new Random();
        int fullDayHour = 8;                                   //Full day working-hour
        int fullDayWage = wagePerHour * fullDayHour;           //Daily wage
        int partTimeHour = 4;                                  //Part-time working-hour
        int partTimeWage = wagePerHour * partTimeHour;         //Daily wage
        int absentHour = 0;
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
            if (totalWorkingHour >= perMonthWorkingHour) {
                System.out.println("Total Employee Wage   = " + (perMonthWorkingHour * wagePerHour));
                System.out.println("Total Working Hour    = " + totalWorkingHour);
                System.out.println("Total Day Present day = " + totalPresentDay);
                break;

            } else if (totalDay == perMonthWorkingDay) {
                System.out.println("Total Employee Wage   = " + totalWorkingHour * wagePerHour);
                System.out.println("Total Working Hour    = " + totalWorkingHour);
                System.out.println("Total Day Present day = " + totalPresentDay);
                break;
            }
        }
    }
    public static void companyA(){
        calculateEmployeeWage("CompanyA", 20, 20, 100);
    }
    public static void companyB(){
        calculateEmployeeWage("CompanyB",22,22,104);
    }
    public static void companyC(){
        calculateEmployeeWage("CompanyC",25,24,108);
    }

    public static void main(String[] args) {
        companyA();
        companyB();
        companyC();

    }
}