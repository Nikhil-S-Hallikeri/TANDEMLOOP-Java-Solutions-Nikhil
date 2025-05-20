package com.test;

import java.util.Scanner;

public class Problem1 {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "addition": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide": return b != 0 ? a / b : Double.NaN;
            default: return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem1 calc = new Problem1();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        sc.nextLine();  // consume newline
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine();

        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);
    }
}
