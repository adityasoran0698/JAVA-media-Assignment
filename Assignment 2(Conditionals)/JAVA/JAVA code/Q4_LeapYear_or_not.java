package Conditionals;

import java.util.Scanner;

public class _30LeapYear_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int n= sc.nextInt();
        if((n%4==0&&n%100!=0)||n%400==0){
            System.out.println(n+" is a leap year");
        } else System.out.println(n+" is not a leap year");

    }
}
