package FunctionArray;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        average();
        countEvenNumbers();
        countOddNumbers();

    }

    public static void average() {
        Scanner input = new Scanner(System.in);

        int i, num, sum = 0;
        System.out.println("Enter the number of elements:");
        num = input.nextInt();
        int[] number = new int[num];

        System.out.println("Enter the elements");
        for (i = 0; i < num; i++) {
            number[i] = input.nextInt();
        }
        //Find the Average Number
        for (i = 0; i < number.length; i++)
            sum = sum + number[i];
        double average = sum / number.length;
        System.out.println("Average value of the array elements is : " + average);
    }

    public static void countEvenNumbers() {
        Scanner input = new Scanner(System.in);

        int i, num, sum = 0;
        System.out.println("Enter the number of elements:");
        num = input.nextInt();
        int[] number = new int[num];
        System.out.println("Enter the elements");
        for (i = 0; i < num; i++) {
            number[i] = input.nextInt();
        }
        //Find the Even Number
        int even = 0;
        for (i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0)
                even++;
        }
        System.out.println("Number of even numbers : " + even);
    }

    public static void countOddNumbers() {
        Scanner input = new Scanner(System.in);

        int i, num, sum = 0;
        System.out.println("Enter the number of elements:");
        num = input.nextInt();
        int[] number = new int[num];
        System.out.println("Enter the elements");
        for (i = 0; i < num; i++) {
            number[i] = input.nextInt();
        }
        //Find the odd Number
        int odd = 0;
        for (i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0)
                odd++;
        }
        System.out.println("Number of odd numbers  : " + (number.length - odd));
    }

}



