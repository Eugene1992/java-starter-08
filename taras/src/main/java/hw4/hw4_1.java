package hw4;

/**
 * Created by Тарас on 13.07.2016.
 */
public class hw4_1 {
    public static void main(String[] args) {
        for (int a = 1; a < 5; a++) {
            for (int b = 1; b < 5; b++) {
                for (int c = 1; c < 5; c++) {
                    for (int i = 1; i < 5; i++) {
                        System.out.print("Ж ");
                    }
                    for (int d = 1; d < 5; d++) {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
            for (int b = 1; b < 5; b++) {
                for (int c = 1; c < 5; c++) {
                    for (int i = 1; i < 5; i++) {
                        System.out.print("- ");
                    }
                    for (int d = 1; d < 5; d++) {
                        System.out.print("Ж ");
                    }
                }
                System.out.println();
            }
        }
    }
}