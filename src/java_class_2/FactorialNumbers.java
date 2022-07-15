//Write  a program to find the factorial of a given number

package java_class_2;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {
        System.out.println("Find Factional Numbers");

        Scanner input= new Scanner(System.in);
        int num, fact=1;
        System.out.println("Enter Your positive numbers: ");
        num=input.nextInt();
        for(int i=num; i>1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of sum: " + fact);

    }
}
