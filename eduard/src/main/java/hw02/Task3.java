package hw02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3");
        System.out.println();
        findOut();

    }
    public static void findOut() {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        int i = 10;

        if (a > b) {
            System.out.println(b + " ближе к " + i + " чем " + a);
        }
        else if (a < b) {
            System.out.println(a + " ближе к " + i + " чем " + b);
        }
    }
}
