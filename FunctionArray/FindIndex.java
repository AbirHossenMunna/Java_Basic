package FunctionArray;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,num,position,flag=0;
        System.out.println("Enter the number of elements:") ;
        num = input.nextInt();
        int[] number = new int[num];

        System.out.println("Enter the elements") ;
        for(i=0;i<num;i++)
        {
            number[i] = input.nextInt();
        }

        System.out.println("Enter the element to be seached");
        position = input.nextInt();

        /*Perform search operation*/
        for(i=0;i<num;i++)
        {
            if(number[i]==position)
            {
                System.out.println("Element "+position+" found at "+i+" position");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element "+position+" not found");
        }
    }
}
