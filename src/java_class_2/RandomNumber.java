package java_class_2;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to number guessing game");

        try {
            int userGuessNumber = 0, count = 0;
            int randomNumberOne = (int)(Math.random() * (10-1) + 1);
            int randomNumberTwo = (int)(Math.random() * (10-1) + 1);

            System.out.println("Enter your favorite number between 1 to 10" + " " + "You have 10 chances at a time");

            System.out.println("Enter your number");
            Scanner input = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                if (input.hasNextInt()) {
                    userGuessNumber = input.nextInt();
                    if (userGuessNumber == randomNumberOne || userGuessNumber == randomNumberTwo) {
                        count += 1;
                        System.out.println("you get one point");
                        //                    break;
                    } else if (userGuessNumber < randomNumberOne || userGuessNumber < randomNumberTwo) {
                        System.out.println("your guess number is low");
                        //                    break;
                    } else if (userGuessNumber > randomNumberOne || userGuessNumber > randomNumberTwo) {
                        System.out.println("your guess number is high");
                        //                    break;
                    }
                    if (i == 10) {
                        System.out.println("You have exceeded the maximum attempt try again later");
                        break;
                    }
                } else {
                    System.out.println("Enter a valid integer number");
                    break;
                }

            }
            System.out.println("Your get" + " " + count + " " + "points");

            input.close();
        } catch (Exception e) {
            System.out.println("Enter valid numbers");
        }

    }
}
