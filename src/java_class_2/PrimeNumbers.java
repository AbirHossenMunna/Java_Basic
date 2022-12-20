//Write a program to print prime numbers from 2 to n

package java_class_2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit for finding the prime numbers");
        int n=sc.nextInt();
        //2  is always a prime number
        System.out.println("The prime numbers are : ");
        System.out.print(2+"  ");

        int i =3;
        while(i<=n){
            boolean flag=true;
            //checking if its an even number
            if(i%2==0){
                flag=false;
            }
            //only checking the odd numbers being prime or not
            //looped till the square root of the number for efficiency
            for(int j=3;j<=Math.sqrt(i);j+=2){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(i+"  ");

            }

            i++;
        }
    }
}


