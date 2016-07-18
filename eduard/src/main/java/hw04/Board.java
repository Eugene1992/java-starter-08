package hw04;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        System.out.println("Board");
        System.out.println();
        makeBoard();
    }
    public static void makeBoard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер доски: ");
        if (scan.hasNextInt()) {
            int h = scan.nextInt();
            int w = scan.nextInt();
            for (int i = 0; i < h; i++) {
                for (int k = 0; k < w; k++)
                    if ((i + k) % 2 == 0) {
                        System.out.print("Ж Ж Ж Ж ");
                    } else
                        System.out.print("- - - - ");
                System.out.println();
            }
        }
    }
}
