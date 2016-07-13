package hw3;

/**
 * Created by shast on 7/12/2016.
 */
public class hw3_0 {
    public static void main(String[] args){
        int start, end, step, sum;

        start = 1000;
        end = 9999;
        step = 3;
        sum = 0;

        for (sum = start; sum < end;){
            System.out.println(sum);
            sum = sum + step;
        }
    }
}
