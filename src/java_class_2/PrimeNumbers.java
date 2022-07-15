//Write a program to print prime numbers from 2 to n

package java_class_2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        try {
            int i = 0;
            int num = 0;
            //Empty String
            String primeNumbers = "";

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your number:");
            int n = input.nextInt();

            for (i = 1; i <= n; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
        } catch (Exception e) {
            System.out.println("Enter valid Numbers");
        }
    }
}


