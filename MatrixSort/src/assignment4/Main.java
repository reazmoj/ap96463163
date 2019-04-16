package assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter The number of matrix row:");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.println("Enter The number of matrix column:");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        randMatrix(matrix, row, col);
        show(matrix, row, col);
        sortMatrix(matrix, row, col);
        show(matrix, row, col);
        scanner.close();
    }

    //-----------------------------------------------------------------------
//create random matrix m*n
    public static void randMatrix(int[][] matrix, int m, int n) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    //-----------------------------------------------------------------------
//show matrix m*n
    public static void show(int[][] matrix, int m, int n) {
        int i, j;
        System.out.println("the matrix that you are created:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //-----------------------------------------------------------------------
//Sort matrix on row or on column
    public static void sortMatrix(int[][] matrix, int row, int col) {
        System.out.println("\nSelect one of the below sorts:");
        System.out.println("1)sort by row(R).");
        System.out.println("2)sort by column(C).");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        int i, j;
        int temp;
        if (select.equals("R")) {
            System.out.println("Enter the row number:");
            int r = sc.nextInt();
            for (i = 0; i < col - 1; i++) {
                int minpos = i;
                for (j = i + 1; j < col; j++)
                    if (matrix[r][j] < matrix[r][minpos])
                        minpos = j;
                if (minpos != j) {
                    temp = matrix[r][minpos];
                    matrix[r][minpos] = matrix[r][i];
                    matrix[r][i] = temp;
                }
            }

        } else if (select.equals("C")) {
            System.out.println("Enter the column number:");
            int c = sc.nextInt();
            for (i = 0; i < row - 1; i++) {
                int minpos = i;
                for (j = i + 1; j < row; j++)
                    if (matrix[j][c] < matrix[minpos][c])
                        minpos = j;

                if (minpos != j) {
                    temp = matrix[minpos][c];
                    matrix[minpos][c] = matrix[i][c];
                    matrix[i][c] = temp;
                }
            }

        } else
            System.out.println("Please select correct case:");
    }

    //-----------------------------------------------------------------------
//selection sort method
    public static void selectionSort(int[] arr) {
        int i, j;
        int temp;
        for (i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minpos])
                    minpos = j;
            temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    //-----------------------------------------------------------------------
//bubble sort method
    public static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}

