package hw4;

import java.util.Scanner;

/**
 * Created by Тарас on 13.07.2016.
 */
public class hw4_3 {
    public static void main(String[] args) {
        //Завдання 3
        Scanner scan = new Scanner(System.in);
        int a, b, d, c, r;
        a = 1;
        System.out.println("Введіть числo");
        b = scan.nextInt();
        d = 0;
        c = b;
        r = 1;
        String res = "";
        for (int i = b; a < c; a++) {
            d = b % a;
            if (d != 0) continue;
            System.out.println(a+ " ");
        }
    }
}
