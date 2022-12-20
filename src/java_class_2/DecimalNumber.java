//Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

package java_class_2;

import java.util.Random;
import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int limit=50;
        //generating random number from 1-50
        int firstRandom=random.nextInt(limit);
//        System.out.println("first random number"+firstRandom);
        int secondRandom=random.nextInt(limit);
//        System.out.println("second random number"+secondRandom);
        int points=0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        //prompting user to guess to guess the number 10 times
        while(i<=10) {
            System.out.println("Guess the number between 1-50!");
            int number=sc.nextInt();
            if(number==firstRandom || number==secondRandom){
                points+=1;
            }
            i+=1;
        }
        System.out.println("Your score is "+points);
    }
}
