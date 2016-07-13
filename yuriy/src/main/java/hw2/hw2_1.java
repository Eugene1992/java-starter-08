package hw2; /**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class hw2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1, a2, a3, b1, b2, b3;

        a1 = scan.nextInt();
        a2 = scan.nextInt();
        a3 = scan.nextInt();

        b1 = a1;
        b2 = a2;
        b3 = a3;


        if (b1 > b2) {
            if (b1 > b3) {
                System.out.println(a1);
            } else {
                if (b2 > b3) {
                    System.out.println(a2);
                } else {
                    System.out.println(a3);
                }
            }
        }
    }
}





















