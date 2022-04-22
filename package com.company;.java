package com.company;

import java.util.*;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("       Namastey      ");
        System.out.println("Enter your A/c No.");
        int a = sc.nextInt();
        System.out.println("Enter your Pin ");
        int b = sc.nextInt();
        if (a == 1234 && b == 123) {
            System.out.println("Your account name is Muskan");
        } else if (a == 4567 && b == 456) {
            System.out.println("Your account name is Kartik");
        } else if (a == 7890 && b == 789) {
            System.out.println("Your account name is Radhika");
        } else {
            System.out.println("INVALID PASSWORD AND ACCOUNT NUMBER");
            return;
        }

        System.out.println("Your Account Type ");
        System.out.println("Press 0-Saving 1-Current 2-Student 3-Exit");
        int c = sc.nextInt();
        switch (c) {
            case 0:
                System.out.println("Saving account");
                break;
            case 1:
                System.out.println("Current account");
                break;
            case 2:
                System.out.println("Student account");
                break;
            case 3:
                System.out.println(" Exit ");
                return;
            default:
                System.out.println("INVALID INPUT");
        }
        System.out.println("Press 0-WITHDRAWL , 1-DEPOSIT ,2-TOTAL BALANCE 3-EXIT");
        int d = sc.nextInt();
        if (d == 3) {
            System.out.println("Exit 'THANK FOR USING ATM HAVE A GOOD DAY ");
        } else if (d == 0) {
            System.out.println("ENTER amount you want to withdraw ");
            int e = sc.nextInt();
            System.out.println("Amount deducted =" + e);
            int min;
            if (a == 1234) {
                min = 500 - e;
                System.out.println("Total balance left = " + min);
            } else if (a == 4567) {
                min = 10 - e;
                System.out.println("Total balance left = " + min);
            } else if (a == 7890) {
                min = 0 - e;
                System.out.println("Total balance left = " + min);
            }
        } else if (d == 1) {
            System.out.println("ENTER amount you want to deposit  ");
            int f = sc.nextInt();
            System.out.println("Amount added = " + f);
            int add;
            if (a == 1234) {
                add = 500 - f;
                System.out.println("Total balance  = " + add);
            } else if (a == 7890) {
                add = 0 - f;
                System.out.println("Total balance  = " + add);
            } else if (a == 4567) {
                add = 500 - f;
                System.out.println(" Total balance  = " + add);
            } else if (d == 2 && a == 7890) {
                System.out.println("The total bank balance is Rs 0.00.");
            } else if (d == 2 && a == 1234) {
                System.out.println("The total bank balance is Rs 500.00. ");
            } else if (d == 2 && a == 4567) {
                System.out.println("The total bank balance is Rs 10.00. ");
            } else {
                System.out.println("INVALID INPUT");
            }
        }
    }
}