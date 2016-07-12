package hw3;

/**
 * Created by shast on 7/12/2016.
 */
import java.util.Scanner;
public class hw3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, i, i2, i1;
        System.out.print("Введіть число в десятковій системі: ");
        a = scan.nextInt();
        System.out.print("Виберіть ажану систему числення (2, 8, 16): ");
        i2 = scan.nextInt();

        switch (i2) {
            case 2:
                String res = "";
                i = a;
                //i1 = 2;
                while (i >= 1) {
                    b = i % 2;
                    i = i / 2;
                    if (i == 1) {
                        res = 1 + res;
                    }else{
                        res = b + res;
                    }
                }
                System.out.println(res);
                break;

            case 8:
                /*String res1 = "";
                i = a;
                //i1 = 8;
                while (i >= 1) {
                    b = i % 8;
                    i = i / 8;
                    if (i == 1) {
                        res = 1 + res1;
                    }else{
                        res = b + res1;
                    }
                }
                System.out.println(res1);
                break;*/

            case 16:
                /*String res = "";
                i = a;
                i1 = 2;
                while (i >= 1) {
                    b = i % 2;
                    i = i / 2;
                    if (i == 1) {
                        res = 1 + res;
                    }else{
                        res = b + res;
                    }
                }
                System.out.println(res);
                break;*/
        }
    }
}
