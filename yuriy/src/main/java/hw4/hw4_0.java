package hw4;

/**
 * Created by shast on 7/13/2016.
 */
public class hw4_0 {
    public static void main(String[] args) {

        for (int d = 1; d < 5; d++) { // початок загального циклу

            for (int c = 1; c < 5; c++) { // перші 4 строки повністю

                for (int b = 1; b < 5; b++) { // перша строка повністю
                    for (int i = 1; i < 5; i++) {
                        System.out.print("Ж ");
                    }
                    for (int a = 1; a < 5; a++) {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }

            for (int c = 1; c < 5; c++) { // другі 4 строки

                for (int b = 1; b < 5; b++) { // перша строка повністю
                    for (int i = 1; i < 5; i++) {
                        System.out.print("- ");
                    }
                    for (int a = 1; a < 5; a++) {
                        System.out.print("Ж ");
                    }
                }
                System.out.println();
            }
        }
    }
}





