package Conditionals;

import java.util.Scanner;

public class _32LeastAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter third Number: ");
        int c = sc.nextInt();
        if(a==b&&b==c){
            System.out.println("All numbers are equal");
        }
        else if(a<=b){
            if(a<c) {
                System.out.println(a + " is least number");
            }
            else{
                System.out.println(c + " is least number");
            }
        }
        else if(a>=b){
            if(b<c){
                System.out.println(b + " is least number");
            }
            else{
                System.out.println(c + " is least number");
            }
        }

    }
}
