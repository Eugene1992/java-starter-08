package hw3;

/**
 * Created by shast on 7/12/2016.
 */
import java.util.Scanner;
public class Hw3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, i2;
        System.out.print("Введіть число в десятковій системі: ");
        a = scan.nextInt();
        System.out.print("Виберіть бажану систему числення (2, 8, 16): ");
        i2 = scan.nextInt();
        countSystem(a, i2);
    }
    static int countSystem(int a, int i2){
        int b;
        switch (i2) {
            case 2:
                if (a != 0) {
                    b = a % 2;
                    System.out.print(b);
                    a = a / 2;
                }
            case 8:
                if (a != 0) {
                    b = a % 8;
                    System.out.print(b);
                    a = a / 8;
                }
            case 16:
                if (a != 0) {
                    b = a % 16;
                    System.out.print(b);
                    a = a / 16;
                }
        }return i2;
    }
}
