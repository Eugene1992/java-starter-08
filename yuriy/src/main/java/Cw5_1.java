/**
 * Created by shast on 7/12/2016.
 */
import java.util.Scanner;
public class Cw5_1 {
    public static void main(String[] args) {
        int stop, step, sum, s;

        Scanner scan = new Scanner (System.in);
        System.out.println("Введіть число: ");
        s = scan.nextInt();
        stop = 102;

        for (int start = 100; start < stop; start++){
            if (start % s != 0)continue;
                System.out.println("не 0");

        }

    }
}
