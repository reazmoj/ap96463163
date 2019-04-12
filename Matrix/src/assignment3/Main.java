package assignment3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        randMatrix(matrix , n);
        show(matrix , n);
        System.out.println("-------------------------------");
        showDiameterical(matrix , n);
        System.out.println("\n-------------------------------");
        showDiameterical2(matrix , n);
    }
//-----------------------------------------------------------------------
//enter random matrix
    public static void randMatrix(int [][] matrix , int n){
        int i , j;
        for (i = 0 ; i < n ; i++) {
            for (j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*100);
            }
        }
    }
//-----------------------------------------------------------------------
//show matrix
    public static void show(int [][] matrix , int n){
        int i , j;
        System.out.println("the matrix that you are created:");
        for (i = 0 ; i < n ; i++) {
            for (j = 0; j < n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
//-----------------------------------------------------------------------
//nemayesh matris be soorat ghotri az paeen be bala....
    public static void showDiameterical(int [][] matrix , int n){
        for (int i = 0 ; i < 2*n ; i++) {
            for (int j = 0; j <= i ; j++) {
                int k = i - j;
                if (k < n && j < n)
                    System.out.print(matrix[j][k] + "\t");

            }
        }
    }
//-----------------------------------------------------------------------
//nemayesh matris be soorat ghotri az bala be paeen....
    public static void showDiameterical2(int [][] matrix , int n){
        for (int i = 0 ; i < 2*n ; i++) {
            for (int j = 0; j <= i ; j++) {
                int k = i - j;
                if (k < n && j < n)
                    System.out.print(matrix[k][j] + "\t");
            }
        }
    }
}
