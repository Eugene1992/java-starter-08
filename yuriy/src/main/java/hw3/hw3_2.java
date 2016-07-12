package hw3;

/**
 * Created by shast on 7/12/2016.
 */
public class hw3_2 {
    public static void main(String[] args) {
        int start, stop, step, sum;

        start = 90;
        stop = 0;
        step = 5;
        sum = 0;

        for (sum = start; sum > stop;){
            System.out.println(sum);
            sum = sum - step;
        }
    }
}
