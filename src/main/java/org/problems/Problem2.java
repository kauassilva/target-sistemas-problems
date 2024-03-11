package org.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(num));

    }

    private static String fibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (num == a) {
                return num + " belongs to the Fibonacci sequence.";

            }

            int temp = a;
            a = b;
            b = temp + b;
        }

        return num + " does not belong to the fibonacci sequence.";
    }

}
