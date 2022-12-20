//Write a program to check balance and withdraw money from ATM booth using if else or switch case

package java_class_2;

import java.util.Scanner;

public class AtmBooth {
    public static void main(String[] args) {
        Double balance = 50000.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do? Balance or Withdrawal?\n" +
                "Press 1 for checking available balance\n" +
                "Press 2 for Withdrawing money");
        int input = sc.nextInt();
        switch (input) {
            //displaying available balance
            case 1:
                System.out.println("Available balance: " + balance);
                break;
            //displaying available balance after withdrawing
            case 2:
                System.out.println("How much do you want to Withdraw?");
                int withdraw = sc.nextInt();
                balance -= withdraw;
                System.out.println("Withdrawal Amount: " + withdraw);
                System.out.println("Available balance: " + balance);
                break;
            default:
                System.out.println("Invalid input given");
        }
    }
}
