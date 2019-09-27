package com.stackroute;

import java.util.Scanner;

public class addMatrix {
    public void addTwoMatrices() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number of rows of matrix:");
        int rows= scanner.nextInt();
        System.out.println("Input number of columns of matrix:");
        int col= scanner.nextInt();
        int[][] arr= new int[rows][col];
        System.out.println("Input elements of first matrix:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        int[][] crr= new int[rows][col];
        System.out.println("Input elements of second matrix:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        int[][] fin= new int[rows][col];
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                fin[i][j]= arr[i][j]+ crr[i][j];
            }
        }
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                System.out.print(fin[i][j]);
            }
            System.out.println("");
        }
    }
}
