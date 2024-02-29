package Loops;

import java.util.Scanner;

public class _46_Sum_Of_NaturalNumbers_upto_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of "+n+" Natural numbers is "+sum);
    }
}
