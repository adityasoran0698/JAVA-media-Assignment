package Conditionals;

import java.util.Scanner;

public class _19ProfitLoss {
    public static void main(String[] args) {
        int cp, sp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price of the product: ");
        cp = sc.nextInt();
        System.out.print("Enter selling price of the product: ");
        sp = sc.nextInt();
        if (sp > cp) {
            int a = sp - cp;
            System.out.println("PROFIT by " + a);
        } else if (cp > sp) {
            int b = cp - sp;
            System.out.println("LOSS by " + b);

        } else {
            System.out.println("NO PROFIT NO LOSS");
        }


    }
}
