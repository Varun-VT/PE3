package com.stackroute;

import java.util.Scanner;

public class StudentMarks {
    public void inputStudentMarks() throws Exception {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int size= scanner.nextInt();
        int[] numOfStudents= new int[size];
        for (int i=0; i<size; i++){
            int temp= scanner.nextInt();
            if (temp>0 && temp<100){
                numOfStudents[i]= temp;
            }
            else{
                throw new Exception("Enter a valid number between 0 and 100");
            }
        }
    }
}
