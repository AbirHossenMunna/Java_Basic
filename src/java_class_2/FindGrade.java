//Write a program to calculate GPA and find grade

package java_class_2;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner input = new Scanner(System.in);


        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject" + (i + 1) + ":");
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
        //Calculating average here
        avg = total / 6;
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A+");
        } else if (avg >= 75 && avg < 79) {
            System.out.print("A");
        } else if (avg >= 70 && avg < 74) {
            System.out.print("A-");
        }else if (avg >= 65 && avg < 69) {
            System.out.print("B+");
        }else if (avg >= 60 && avg < 64) {
            System.out.print("B");
        }else if (avg >= 55 && avg < 59) {
            System.out.print("B-");
        }else if (avg >= 50 && avg < 54) {
            System.out.print("C+");
        }else if (avg >= 45 && avg < 49) {
            System.out.print("C");
        }else if (avg >= 40 && avg < 44) {
            System.out.print("D");
        }else {
            System.out.print("F");
        }
    }
}

