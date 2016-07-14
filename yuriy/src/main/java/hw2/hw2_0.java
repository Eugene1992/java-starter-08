package hw2;

/**
 * Created by shast on 7/13/2016.
 */
    import java.util.Scanner;
    public class Hw2_0 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i, a, b;
            i = scan.nextInt();
            wholeOrNotWhole(i);
        }
        static int wholeOrNotWhole(int i) {
            int a, b;
            a = i;
            b = a % 2;
            if (b > 0) {
                System.out.println("No");
            } else {
                System.out.println("Yeah");
            }
            return b;
        }
    }



