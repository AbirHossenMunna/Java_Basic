package ArrayFunctionPractice;

public class MyFunction {
    public static void main(String[] args) {
        double sum =sum(10, 5);
        multiply((int) sum);//narrow casting use
    }
     //integer value
    /*public static int sum(int a, int b) {
       return (a + b);

    }*/

    public static double sum(int a, int b) {
        return (a + b);

    }
    public static void multiply(int a){
        System.out.println(a*2);
    }
}
