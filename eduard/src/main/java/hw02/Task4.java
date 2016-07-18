package hw02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task 4");
        System.out.println();
        findOutNum();

    }

    public static void findOutNum() {

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
