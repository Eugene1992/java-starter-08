package hw4;
import java.util.Scanner;
/**
 * Created by Тарас on 13.07.2016.
 */
public class Hw4_2 {
    public static void main(String[] args) {
        //Завдання 2
        Scanner scan = new Scanner(System.in);
        int b;
        System.out.println("Введіть числo");
        b = scan.nextInt();
        factorial(b);
    }
        static int factorial(int b){
        int a, fact, c, r;
        a = 1;
        fact = 0;
        c = b;
        r = 1;
        String res = "";
        for (int i = b; r < c; i = a * b) {

            fact = a * b;
            b = fact;
            a++;;
            r++;
        }
            System.out.println(fact);
            return r;
    }
}

