package hw3;

/**
 * Created by shast on 7/12/2016.
 */
public class hw3_1 {
    public static void main(String[] args) {
        int start, end, step, sum;

        start = 1;
        end = 110;
        step = 2;
        sum = 0;

        for (sum = start; sum < end;){
            System.out.println(sum);
            sum = sum + step;
        }
    }
}
