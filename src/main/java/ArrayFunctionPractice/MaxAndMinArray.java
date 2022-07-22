package ArrayFunctionPractice;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2, 4, 6, 8};
        int maxNumbers=findMax(num);
        int minNumbers=findMin(num);
        System.out.println(maxNumbers);
        System.out.println(minNumbers);

    }
    //find Max
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        int i;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
//FindMin
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        int i;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
