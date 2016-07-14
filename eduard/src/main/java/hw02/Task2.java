package hw02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " - четное");
        }
        else {
            System.out.println(i + " - нечетное");
        }
    }
}