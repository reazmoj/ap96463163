package assignment5;

public class Main {

    public static void main(String[] args){
        double f;
        double max = 0;
        double min = 0;
        Long startTime = System.currentTimeMillis();
        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000 && y != 0 && x != 0; y++) {
                f = Math.sqrt(x * x + y * y) / ((x * Math.sin(x + y)) + (y * Math.cos(x + y)));
                if (max < f)
                    max = f;
                if (min > f)
                    min = f;
            }
        }
        System.out.println((System.currentTimeMillis() - startTime) + " ms");
        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
    }
}
