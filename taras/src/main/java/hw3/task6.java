package hw3;

import java.util.Scanner;

/**
 * Created by Тарас on 12.07.2016.
 */
public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, y, r, a1, b1, c1, d1, e1, f1;
        i = scan.nextInt();
        System.out.println("Введіть систему числення");
        y = scan.nextInt();
        if (y < 3) {
            while (i != 0) {
                r = i % 2;
                System.out.print(r);
                i = i / 2;
            }
        } else {
            if (y < 9) {
                while (i != 0) {
                    r = i % 8;
                    System.out.print(r);
                    i = i / 8;

                }
            } else {
                if (y < 17) {
                    while (i != 0) {
                        r = i % 16;
                        //System.out.print(r);
                        i = i / 16;
                        System.out.print(r);
                    }
                }

            }
        }
    }
}