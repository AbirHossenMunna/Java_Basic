//Write a program to calculate GPA and find grade

package java_class_2;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Calculating GPA for the semester
        System.out.println("How many courses did you take?");
        int noOfCourses=sc.nextInt();
        int totalCredit=0;
        int courseMark;
        double totalGpa=0;

        for(int i=1;i<=noOfCourses ;i++){
            System.out.println("What marks did you get in course "+i +"?");
            courseMark=sc.nextInt();
            String grade=findGrade((courseMark));
            System.out.println("Grade for Course "+i+" : "+grade);
            double courseGpa = course_gpa(grade);
            System.out.println("GPA for course " + i +" : "+courseGpa);
            System.out.println("What is the course credit?");
            int course_credit=sc.nextInt();
            totalGpa+=courseGpa*course_credit;
            totalCredit+=course_credit;
        }
        double gpa=totalGpa/totalCredit;
        System.out.println("CGPA for this semester is "+String.format("%.2f",gpa));

    }
    //finding grade by course mark
    public static String findGrade(int mark){
        String grade="";
        if(mark>=90 && mark<=100){
            grade="A";
        }
        else if(mark>=85 && mark<=89){
            grade="A-";
        }
        else if(mark>=80 && mark<=84){
            grade="B+";
        }
        else if(mark>=75 && mark<=79){
            grade="B";
        }
        else if(mark>=70 && mark<=74){
            grade="B-";
        }
        else if(mark>=65 && mark<=69){
            grade="C+";
        }
        else if(mark>=60 && mark<=64){
            grade="C";
        }
        else if(mark>=55 && mark<=59){
            grade="D";
        }
        else{
            grade="F";
        }
        return grade;

    }
    //finding GPA by grade
    public static double course_gpa(String grade){
        if (grade=="A"){
            return 4.0;
        }
        else if(grade=="A-"){
            return 3.7;
        }
        else if(grade=="B+"){
            return 3.3;
        }
        else if(grade=="B"){
            return 3.0;
        }
        else if(grade=="B-"){
            return 2.7;
        }
        else if(grade=="C+"){
            return 2.3;
        }
        else if(grade=="C"){
            return 2.0;
        }
        else if(grade=="D"){
            return 1.7;
        }
        else{
            return 0;
        }
    }
}

