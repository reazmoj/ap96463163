package assignment2;

public class Main {
    public static void main(String[] args) {
        int num=1;
        for (int i=1 ; i<=7 ; i++){
            for (int j=num ; j<=4 ; j++){
                System.out.print(" ");
            }
            for (int k=1 ; k<=num*2-1 ;k++){
                System.out.print("*");
            }
            if (i<4)
                num++;
            else
                num--;
            System.out.println(" ");
        }
    }
}
