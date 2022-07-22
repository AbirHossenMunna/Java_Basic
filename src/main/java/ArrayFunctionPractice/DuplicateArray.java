package ArrayFunctionPractice;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2, 4, 6, 8, 2, 3, 5};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
