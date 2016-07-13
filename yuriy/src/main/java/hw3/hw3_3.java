package hw3;

/**
 * Created by shast on 7/12/2016.
 */
public class hw3_3 {
    public static void main(String[] args) {
        int start, stop, step, sum, n;
// як змусити цикл повторити операцію 20 раз
        start = 2;
        sum = 0;
        n = 21;
        stop = 0;

        for (sum = start; stop < n;){
            System.out.println(sum);
            sum = 2 * sum;
            stop++;

        }
    }
}
