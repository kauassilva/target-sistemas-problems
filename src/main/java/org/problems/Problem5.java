package org.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        scanner.close();

        String reversedString = reverseString(originalString);

        System.out.println(reversedString);

    }

    private static String reverseString(String originalString) {
        char[] reversed = originalString.toCharArray();
        int left = 0;
        int right = reversed.length - 1;

        while (left < right) {
            char temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
            left++;
            right--;
        }
        return new String(reversed);
    }

}