//Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package java_class_2;

import java.util.Scanner;

public class LargestOrSmallest {
    public static void main(String[] args) {
        int numbers, largeNumber = Integer.MIN_VALUE, smallNUmber = Integer.MAX_VALUE;
        char choice;

        Scanner input = new Scanner(System.in);
        try {
            do {
                System.out.println("Enter the numbers: ");
                numbers = input.nextInt();

                if (numbers > largeNumber) {
                    largeNumber = numbers;
                }
                if (numbers < smallNUmber) {
                    smallNUmber = numbers;
                }

                System.out.println(" Your numbers is: " + " " + numbers);
                System.out.println("Do You Want continue y/n?");
                choice = input.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');
            System.out.println(largeNumber + " " + "is a largest numbers");
            System.out.println(smallNUmber + " " + "is a smallest numbers");

        } catch (Exception e) {
            System.out.println("Enter valid numbers");
        }
    }
}