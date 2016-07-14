package hw2; /**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class Hw2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a1, a2;
        System.out.print("Введіть 1-ше число: ");
        a1 = scan.nextDouble();
        System.out.print("Введіть 2-ге число: ");
        a2 = scan.nextDouble();
        closeToTen(a1, a2);

        System.out.println("1");
    }
    static double closeToTen(double a1, double a2) {
        double b1, b2, c1, c2;
        b1 = a1;
        b2 = a2;
        c1 = 10 - b1;
        c2 = b2 - 10;
        if (c1 < c2) {
            System.out.println("Ближче до десяти: " + a1);
        } else {
            System.out.println("Ближче до десяти: " + a2);
        }
        return c1;
    }
}

