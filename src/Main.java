import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] world = {-7.1, -6.1, -5.1, -4.1, -3.1, -2.1, -1.1, 0, 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1};
        System.out.println(Arrays.toString(world));

        double[] number = {-7.1, -6.1, -5.1, -4.1, -3.1, -2.1, -1.1, 0, 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1};
        boolean bishkek = false;
        int count = 0;
        double sum = 0;
        for (double i : number) {
            if (bishkek == false) {
                if (i < 0) {
                    bishkek = true;
                }
            } else {
                if (i > 0) {
                    count++;
                    sum = sum + i;
                }

            }


        }

    }

}
