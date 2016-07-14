package hw4;

/**
 * Created by shast on 7/12/2016.
 */
import java.util.Scanner;
public class Hw4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, c, i;
        System.out.print("Введість число: ");
        i = scan.nextInt();
        factorial(i);
    }
    static int factorial (int i){
        int result = 1;
        if (i == 0 || i == 1) {
            System.out.println(result);
        }
        for (int b = 2; b <= i; b++) {
            result *= b;
            System.out.println(result);
        }
        return result;
    }
}







