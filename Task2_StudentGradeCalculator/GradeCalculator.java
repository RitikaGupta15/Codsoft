package Task2_StudentGradeCalculator;

import java.util.*;

public class GradeCalculator {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number of Subjects : ");
        int numSubjects=sc.nextInt();

        int Marks[]= new int[numSubjects];
        int total=0;

        for(int i=0;i<numSubjects;i++){
            System.out.print("Enter the marks for Subject " + (i+1) + ": " );
            Marks[i]= sc.nextInt();
            total+=Marks[i];
        }
        double average = (double) total / numSubjects;
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
    
}
