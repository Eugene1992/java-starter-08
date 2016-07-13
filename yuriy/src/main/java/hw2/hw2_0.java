package hw2; /**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class hw2_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a1, a2, b1, b2, c1, c2;

        a1 = scan.nextInt();
        a2 = scan.nextInt();

        b1 = a1;
        b2 = a2;

        c1 = 10 - b1;
        c2 = b2 - 10;

        if (c1 < c2){
            System.out.println(a1);
        }else{
            System.out.println(a2);
        }
    }
}
