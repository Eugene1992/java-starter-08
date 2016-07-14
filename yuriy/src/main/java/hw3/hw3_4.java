package hw3;

/**
 * Created by shast on 7/12/2016.
 */
public class Hw3_4 {
    public static void main(String[] args) {
        int start, start1, stop, step, sum, n, a;
        start = 1;
        start1 = 1;
        stop = 0;
        n = 20;
        sum = 0;
        fourNumber (start, stop, start1, n, sum);
    }
    static int fourNumber(int start, int stop, int start1, int n, int sum) {
        for (sum = start; stop < n;){
            sum = start + start1;
            start1 = start;
            start = sum;
            System.out.println(sum);
            stop++;
        }
        return sum;
    }
}
