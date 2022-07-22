package FunctionArray;

public class FindSalary {
    public static void main(String args[]) {
        int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
        System.out.println("Third Largest: " + getThirdLargest(salary, 6));
    }

    public static int getThirdLargest(int[] salary, int total) {
        int find;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (salary[i] > salary[j]) {
                    find = salary[i];
                    salary[i] = salary[j];
                    salary[j] = find;
                }
            }
        }
        return salary[total - 3];
    }
}

