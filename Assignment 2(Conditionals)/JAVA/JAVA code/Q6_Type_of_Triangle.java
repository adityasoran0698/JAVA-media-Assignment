package Conditionals;

import java.util.Scanner;

public class _31Type_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter second side of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter third side of triangle: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}
