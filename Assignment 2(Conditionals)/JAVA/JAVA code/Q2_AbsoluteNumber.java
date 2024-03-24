package Conditionals;

import java.util.Scanner;

public class _18AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }
    }
}
