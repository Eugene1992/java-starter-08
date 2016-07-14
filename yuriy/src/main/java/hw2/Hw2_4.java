package hw2;

/**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class Hw2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1, b2, c3;
        System.out.print("Введіть змінну а: ");
        a1 = scan.nextInt();
        System.out.print("Введіть змінну b: ");
        b2 = scan.nextInt();
        System.out.print("Введіть змінну с: ");
        c3 = scan.nextInt();
        squareNumb(a1, b2, c3);
    }
    static double squareNumb(int a1, int b2, int c3) {
        double d, r, x1, x2;
        d = (b2 * b2) - 4 * a1 * c3;
        r = Math.sqrt(d);
        x1 = (-b2 - r) / 2 * a1;
        x2 = (-b2 + r) / 2 * a1;
        if (r > 0) {
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.print("Коренів немає");
        }return r;
    }
}





