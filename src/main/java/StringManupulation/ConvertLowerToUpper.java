package StringManupulation;

import javax.sound.midi.Soundbank;

public class ConvertLowerToUpper {
    public static void main(String[] args) {
        String str="rahim lives in sylhet";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String firstLetter= String.valueOf(words[i].charAt(0)).toUpperCase();
            String othersLetter=words[i].substring(1);
            System.out.println(firstLetter+othersLetter);

        }
    }
}
