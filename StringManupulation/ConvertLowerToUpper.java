package StringManupulation;

import javax.sound.midi.Soundbank;

public class ConvertLowerToUpper {
    public static void main(String[] args) {
        String reqstr = " ";
        String str = "rahim lives in sylhet";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            String ch1 = String.valueOf(ch).toUpperCase();
            String sub = arr[i].substring(1);
            reqstr = reqstr + ch1 + sub + " ";

        }
        System.out.println("Each 1st char to uppercase is: " + reqstr.trim());
    }
}
