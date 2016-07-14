package hw2; /**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class Hw2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1, a2, a3, b1, b2, b3;
        System.out.print("Введіть першу змінну: ");
        a1 = scan.nextInt();
        System.out.print("Введіть другу змінну: ");
        a2 = scan.nextInt();
        System.out.print("Введіть третю змінну: ");
        a3 = scan.nextInt();

        maxValue(a1, a2, a3);
    }
    static int maxValue(int a1, int a2, int a3) {
        int b1, b2, b3;
        b1 = a1;
        b2 = a2;
        b3 = a3;
        if (b1 > b2) {
            if (b1 > b3) {
                System.out.println("Максимальне значення: " + a1);
            }
            }if (b2 > b1) {
                if (b2 > b3) {
                    System.out.println("Максимальне значення: " + a2);
            }
            }else{
                if (b3 > b1){
                    if (b3 > b2){
                        System.out.println("Максимальне значення: " + a3);
                    }
                }
        }return b1;
    }
}























