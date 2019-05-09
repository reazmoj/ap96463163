package assignment6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        x = scanner.nextInt();

        int rowNumbers = (int) (Math.random() * x);    // this line detect number of rows.
        System.out.println("The Random number that created for number of rows is: " + rowNumbers);
        ArrayList<ArrayList<Integer>> twoDimentionArray = new ArrayList<ArrayList<Integer>>(rowNumbers);

        for (int i = 0 ; i < rowNumbers ; i++){
            Random random1 = new Random();
            int y = random1.nextInt(x) ;
            ArrayList<Integer> row = new ArrayList<Integer>(y);

            for (int j = 0 ; j < y ; j++){
                Random random = new Random();
                row.add(random.nextInt(x));
            }
            twoDimentionArray.add(row);
        }

        for (int i = 0 ; i < rowNumbers ; i++){
            for (int j = 0 ; j < twoDimentionArray.get(i).size() ; j++){
                System.out.print(twoDimentionArray.get(i).get(j) + " ");
            }
            System.out.println();
        }

        int sum = 0;
        float avg [] = new float[rowNumbers];
        for (int i = 0 ; i < rowNumbers ; i++) {
            for (int j = 0; j < twoDimentionArray.get(i).size(); j++) {
                sum += twoDimentionArray.get(i).get(j);
            }
            try {
                avg[i] = sum / twoDimentionArray.get(i).size();
                sum = 0;
            }catch (Exception e){
                System.out.println("\nin computin avg exception divide by zero occur in " + i + "th row..");
            }
        }

        int max = 0;
        int min = 0;
        for (int j = 0 ; j < rowNumbers ; j++){
            if (avg[j] > avg[max])
                max = j;
            if (avg[j] < avg[min])
                min = j;
        }

        System.out.println("\nThe Max average is: " + avg[max] + " in this row:");
        for (int i = 0 ; i < twoDimentionArray.get(max).size() ; i++)
            System.out.print(twoDimentionArray.get(max).get(i)+ " ");

        System.out.println("\nThe Min average is: " + avg[min] + " in this row:");
        for (int i = 0 ; i < twoDimentionArray.get(min).size() ; i++)
            System.out.print(twoDimentionArray.get(min).get(i) + " ");

    }
}