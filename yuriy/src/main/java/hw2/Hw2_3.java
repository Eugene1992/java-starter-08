package hw2; /**
 * Created by shast on 7/11/2016.
 */
/**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class Hw2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i1, i2, i3, i4, a3, b3, c3, d3;
        System.out.print("Введіть перше число: ");
        i1 = scan.nextInt();
        System.out.print("Введіть друге число: ");
        i2 = scan.nextInt();
        System.out.print("Введіть третє число: ");
        i3 = scan.nextInt();
        System.out.print("Введіть четверте число: ");
        i4 = scan.nextInt();
        System.out.println();
        secondNumber(i1, i2, i3, i4);
    }
    static int secondNumber(int i1, int i2, int i3, int i4) {
        if (i1 > i2 && i1 > i3 && i1 > i4) {
            if (i2 > i3 && i2 > i4) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i3 > i2 && i3 > i4) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i4 > i3 && i4 > i2) {
                System.out.println("Друге за величино: " + i4);
            }
        }
        if (i2 > i1 && i2 > i3 && i2 > i4) {
            if (i1 > i3 && i1 > i4) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i3 > i1 && i3 > i4) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i4 > i3 && i4 > i1) {
                System.out.println("Друге за величино: " + i4);
            }
        }
        if (i3 > i1 && i3 > i2 && i3 > i4) {
            if (i2 > i1 && i2 > i4) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i1 > i2 && i1 > i4) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i4 > i1 && i4 > i2) {
                System.out.println("Друге за величино: " + i4);
            }
        }
        if (i4 > i1 && i4 > i2 && i4 > i1) {
            if (i2 > i3 && i2 > i1) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i3 > i2 && i3 > i1) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i1 > i3 && i1 > i2) {
                System.out.println("Друге за величино: " + i4);
            }
        }
        return i1;
    }
}


















