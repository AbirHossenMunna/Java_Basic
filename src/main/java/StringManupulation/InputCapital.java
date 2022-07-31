package StringManupulation;

import java.util.Scanner;

public class InputCapital {
    public static void main(String[] args) {
        capitalLatter();


    }

    public static void capitalLatter() {
        Scanner input = new Scanner(System.in);
        System.out.println("please type a word: ");
        String latter = input.nextLine();
        int stringLength = latter.length();
        String latter1 = latter.substring(0, 1);
        String lastLatter = latter.substring((stringLength - 1), (stringLength));
        String newWord = latter1.toUpperCase() + lastLatter.toUpperCase();
        System.out.println("The word is capital is : " + newWord);
    }
}

