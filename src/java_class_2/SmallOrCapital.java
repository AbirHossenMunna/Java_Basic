//Write a program to check if inputted letter is small or capital

package java_class_2;

import java.util.Scanner;

public class SmallOrCapital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        System.out.println("Enter the Character:");
        letter = input.next().charAt(0);

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter +" is a Capital letter");
        } else if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter +" is a Small letter");
        }else {
            System.out.println(letter +" is not a letter");
        }

    }
}
