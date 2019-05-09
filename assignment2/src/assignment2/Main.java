package assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================");
        System.out.println("rasme lozi be ghotre 2*n-1:");
        System.out.println("=================");

        System.out.println("lotfan ghotre ra vared konid:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int num=1;
        for (int i=1 ; i<=2*number-1 ; i++){
            for (int j=num ; j<=number ; j++){
                System.out.print(" ");
            }
            for (int k=1 ; k<=num*2-1 ;k++){
                System.out.print("*");
            }
            if (i<number)
                num++;
            else
                num--;
            System.out.println(" ");
        }
    }
}
