package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 0) {
            System.out.println("Employee is absent");
        } else {
            System.out.println("Emplyee is present");
        }

    }
}

