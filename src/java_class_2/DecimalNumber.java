//Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

package java_class_2;

import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {
        System.out.println("Two Decimal Value Check");
        try {
            Scanner input = new Scanner(System.in);
            double number_1;
            double number_2;

            System.out.println("Enter First Number: ");
            number_1 = input.nextDouble();
            System.out.println("Enter Second Number: ");
            number_2 = input.nextDouble();
            if (number_1 == number_2) {
                System.out.println("Both Number are same");
            } else {
                System.out.println("Both Number are Different");
            }
        } catch (Exception e) {
            System.out.println("Enter valid number");
        }
    }
}
