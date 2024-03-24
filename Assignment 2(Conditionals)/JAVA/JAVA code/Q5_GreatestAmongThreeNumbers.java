package Conditionals;

import java.util.Scanner;

public class _24GreatestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();
        if (a > b && a > c) System.out.println(a + " is greater among " + b + " and " + c);
        if (b > c && b > a) System.out.println(b + " is greater among " + a + " and " + c);
        if (c > b && c > a) System.out.println(c + " is greater among " + a + " and " + b);

    }
}
