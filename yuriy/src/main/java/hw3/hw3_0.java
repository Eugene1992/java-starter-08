package hw3;

/**
 * Created by shast on 7/12/2016.
 */
public class Hw3_0 {
    public static void main(String[] args) {
        int start, end, step, sum;

        start = 1000;
        end = 9999;
        step = 3;
        sum = 0;
        fourNumber(start, end, step, sum);
    }

    static int fourNumber(int start, int end, int step, int sum) {
        for (sum = start; sum < end; ) {
            System.out.println(sum);
            sum = sum + step;
        }
        return sum;
    }
}

