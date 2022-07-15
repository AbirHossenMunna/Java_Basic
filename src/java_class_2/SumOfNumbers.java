//Write a program to sum of numbers which only divisible by 5 from 1 to 100

package java_class_2;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("five divided number Show: " + "\n");
        int sum = 0, num = 100, i;
        for (i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                sum += i;
                System.out.println("five divided number : " + i);
            }
        }
        System.out.println("sum of total numbers: " + sum);
    }
}
