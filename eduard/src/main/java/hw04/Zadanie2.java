package hw04;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            System.out.println("Делителями числа " + i + " являются:");
            for (int a = i; a > 0; a--) {
                int b = i % a;
                if (b == 0)
                    System.out.print(a + " ");
            }
        }
    }

}
