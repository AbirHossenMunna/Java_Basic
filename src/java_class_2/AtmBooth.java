//Write a program to check balance and withdraw money from ATM booth using if else or switch case

package java_class_2;

import java.util.Scanner;

public class AtmBooth {
    public static void main(String[] args) {
        int amount = 10000, withdraw, deposit, num;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("********Welcome to ATM Service**************");
            System.out.println("1. Withdraw Balance");
            System.out.println("2. Deposit Balance");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter Your option: ");
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter Amount to be withdraw");
                    withdraw = input.nextInt();
                    if (amount >= withdraw) {
                        amount = amount - withdraw;
                        System.out.println("Balance amount is:   " + amount);
                        System.out.println("Please Collect money");
                    } else {
                        System.out.println("You don't have enough money for withdraw");
                    }
                    System.out.println("   ");
                    break;
                case 2:
                    System.out.println("Enter Amount to deposit");
                    deposit = input.nextInt();
                    amount = amount + deposit;
                    System.out.println("Balance amount is:   " + amount);
                    System.out.println("money has ben deposit successfully");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Balance amount is:   " + amount);
                    System.out.println("money has ben deposit successfully");
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("  ");
            }
        }
    }
}
