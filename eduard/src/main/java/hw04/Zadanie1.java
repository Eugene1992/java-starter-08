package hw04;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int i;
        long l = 1L;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            for (int a = i; a > 0; a--) {
                l *= a;
            }
            System.out.println("Факториал числа " + i + " равен " + l);
        }
    }

}
