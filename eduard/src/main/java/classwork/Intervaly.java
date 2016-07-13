package classwork;

import java.util.Scanner;

public class Intervaly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int e;
        e = scan.nextInt();
        for (int i = 5; i <= 100; i++) {
            if (i % e != 0) continue;
            System.out.println(i);
        }
    }
}
