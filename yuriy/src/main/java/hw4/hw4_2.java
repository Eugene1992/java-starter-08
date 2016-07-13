package hw4;

/**
 * Created by shast on 7/13/2016.
 */
import java.util.Scanner;
public class hw4_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int i, a, b, c;

        System.out.print("Введіть число: ");
        i = scan.nextInt();

        for (int start = 1; start <= i; start++){
            a = i / start;
            if (i % start !=0) continue;
            System.out.print(" " + a);
        }
    }
}
