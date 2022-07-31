package StringManupulation;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        System.out.println("Enter a line of string: ");
        Scanner input = new Scanner(System.in); //standard input stream
        String x = input.next();
        countVowels(x);

    }

    private static void countVowels(String x) {
        int vowels = 0;
        int conconant = 0;

        for (int i = 0; i < x.length(); i++) {
            if (isVowel(x.charAt(i))) {
                ++vowels;
            } else {
                ++conconant;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("conconant" + conconant);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

}
