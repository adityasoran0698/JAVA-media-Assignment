package Loops;

import java.util.Scanner;

public class _48_PalindromeNumber_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int r;
        int sum = 0;
        int p = n;
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (sum == p) {
            System.out.println("The number " + p + " is Palindrome");
        } else System.out.println("The number " + p + " is not Palindrome");
    }
}
