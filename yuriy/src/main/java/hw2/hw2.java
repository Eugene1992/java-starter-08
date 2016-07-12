package hw2; /**
 * Created by shast on 7/11/2016.
 */

        // Assign #2
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, a, b;
        i = scan.nextInt();

        a = i;
        b = a % 2;

        if (b > 0){
            System.out.println("No");
        }else{
            System.out.println("Yeah");
        }
    }
}
