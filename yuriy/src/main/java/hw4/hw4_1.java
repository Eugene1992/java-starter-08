package hw4;

/**
 * Created by shast on 7/12/2016.
 */
import java.util.Scanner;
public class hw4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, c, i;
        //int a, c, i;
        //i = 0;
        int result = 1;

        for (; ; ) {
            System.out.print("Введість число: ");
            i = scan.nextInt();
            for (int b = 2; b <= i; b++) {
                result *= b;
                System.out.println(result);

                if (i == 0 || i == 1) {
                    System.out.println(result);

                    if (i < 0) {
                        System.out.print("Ви ввели невірне число");
                    }
                }
            }
        }
    }
}





