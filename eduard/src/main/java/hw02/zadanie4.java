package hw02;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        /* Для ввода с консоли

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
         */
        int a = 281;
        int b = 838;
        int c = 711;
        if (a > b) {
            if (a > c) {
                System.out.println("Наибольшее " + a);
            } else {
                if (c > b) {
                    System.out.println("Наибольшее " + c);
                }
            }
        }
        else {
            if (b > c) {
                System.out.println("Наибольшее " + b);
            }

        }
    }
}
