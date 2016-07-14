package hw4;

import java.util.Scanner;

/**
 * Created by Тарас on 13.07.2016.
 */
public class Hw4_3 {
    public static void main(String[] args) {
        //Завдання 3
        Scanner scan = new Scanner(System.in);
        int b;
        System.out.println("Введіть числo");
        b = scan.nextInt();
        denominator(b);
    }
        static int denominator(int b){
        int a, d, c, r;
        a = 1;
        d = 0;
        c = b;
        r = 1;
        String res = "";
        for (int i = b; a < c; a++) {
            d = b % a;
            if (d != 0) continue;
            System.out.println(a+ " ");
        }
            return a;
    }
}
