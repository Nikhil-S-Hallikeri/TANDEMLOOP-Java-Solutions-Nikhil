package com.test;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1) + " ");
        }
    }
}
