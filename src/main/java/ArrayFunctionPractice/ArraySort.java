package ArrayFunctionPractice;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2, 4, 6, 8};
        sortAscendingOrder(num);
        sortDescendingOrder(num);
    }

    public static void sortAscendingOrder(int[] numbers){
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

    public static void sortDescendingOrder(int[] numbers){
        Arrays.sort(numbers);
        for (int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
    }

}

