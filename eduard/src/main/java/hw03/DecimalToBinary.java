package hw03;

//import java.util.Scanner;

public class DecimalToBinary {
    public static void main(int a) {
        //Scanner scan = new Scanner(System.in);
        //int a = scan.nextInt();
        int b;
        String res = "";
        while (a != 0) {
            b = a % 2;
            res = b + res;
            a = a / 2;
        }
        System.out.println("Перевод из 10й в 2-ую " + res);
    }
}
