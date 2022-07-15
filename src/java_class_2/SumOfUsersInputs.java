//Write a program to sum of user input until users input ‘q’ from keyboard

package java_class_2;

import java.util.Scanner;

public class SumOfUsersInputs {
    public static void main(String[] args) {
        int i = 0;
        double number;
        double sum = 0;
        char choice = ' ';

        Scanner input = new Scanner(System.in);
        try {
            for (i = 1; i >= 1; i++) {
                System.out.println("Enter a number : " + " ");
                number = input.nextDouble();
                sum += number;
                i++;

                System.out.println("Do You Want exit? press q or press c");
                choice = input.next().charAt(0);
                if (choice == 'q') {
                    break;
                } else if (choice == 'c') {
                    continue;
                }

            }

        } catch (Exception e) {
            System.out.println("Enter valid number");
        }
        System.out.println("Sum of users " + " " + sum);
    }
}
