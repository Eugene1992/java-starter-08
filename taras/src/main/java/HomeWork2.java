/**
 * Created by Тарас on 11.07.2016.
 */
        //Завдання №2
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        i = scan.nextInt();
        parityNumbers(i);
        double i4, i5;
        i4 = scan.nextDouble();
        i5 = scan.nextDouble();
        comparison (i4, i5);
        double q1, q2, q3;
        q1 = scan.nextDouble();
        q2 = scan.nextDouble();
        q3 = scan.nextDouble();
        bigger (q1, q2, q3);
        int i1, i2, i3, i6, a3, b3, c3, d3;
        System.out.print("Введіть перше число: ");
        i1 = scan.nextInt();
        System.out.print("Введіть друге число: ");
        i2 = scan.nextInt();
        System.out.print("Введіть третє число: ");
        i3 = scan.nextInt();
        System.out.print("Введіть четверте число: ");
        i6 = scan.nextInt();
        System.out.println();
        secondNumber(i1, i2, i3, i6);
        double a6, b6, c6;
        a6 = 6.45;
        b6 = 5.21;
        c6 = 3.33;
        quadraticEquation(a6, b6, c6);
    }
        static int parityNumbers(int i){
        int i1 = i;
        int i3 = i1 % 2;
        if (i3 < 1) {
            System.out.println("число парне");
        } else {
            System.out.println("число непарне");
        }
            return i;
    }

        //Завдання №3
        static double comparison(double i4, double i5){
            double a1,b1,c1,d1;
            a1 = i4;
            b1 = i5;

            c1 = 10 - i4;
            d1 = i5 - 10;
            if (c1 < d1) {
                System.out.println(i4);
            } else {
                System.out.println(i5);
            }
            return d1;
        }
        // /Завдання №4

       static double bigger(double q1, double q2, double q3){
         double a2, b2, c2;

        a2 = q1;
        b2 = q2;
        c2 = q3;
        if (a2 > b2) {
            if (a2 > c2) {
                System.out.println(q1);
            }
        } else {
            if (b2 > c2) {
                System.out.println(q2);
            } else {
                System.out.println(q3);
            }
        }
           return a2;
        }
        //Завдання №5

    static int secondNumber(int i1, int i2, int i3, int i6) {
        if (i1 > i2 && i1 > i3 && i1 > i6) {
            if (i2 > i3 && i2 > i6) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i3 > i2 && i3 > i6) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i6 > i3 && i6 > i2) {
                System.out.println("Друге за величино: " + i6);
            }
        }
        if (i2 > i1 && i2 > i3 && i2 > i6) {
            if (i1 > i3 && i1 > i6) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i3 > i1 && i3 > i6) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i6 > i3 && i6 > i1) {
                System.out.println("Друге за величино: " + i6);
            }
        }
        if (i3 > i1 && i3 > i2 && i3 > i6) {
            if (i2 > i1 && i2 > i6) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i1 > i2 && i1 > i6) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i6 > i1 && i6 > i2) {
                System.out.println("Друге за величино: " + i6);
            }
        }
        if (i6 > i1 && i6 > i2 && i6 > i1) {
            if (i2 > i3 && i2 > i1) {
                System.out.println("Друге за величино: " + i2);
            }
            if (i3 > i2 && i3 > i1) {
                System.out.println("Друге за величино: " + i3);
            }
            if (i1 > i3 && i1 > i2) {
                System.out.println("Друге за величино: " + i6);
            }
        }
        return i1;
    }
        //Завдання 6
        static double quadraticEquation(double a6,double b6,double c6){
        double d6, r, x1, x2;
        d6 = (b6 * b6) - 4 * a6 * c6;
        r = Math.sqrt(d6);
        x1 = (-b6 - r) / 2 * a6;
        x2 = (-b6 + r) / 2 * a6;

        if(r > 0){
            System.out.println(x1);
            System.out.println(x2);
        }else {
            System.out.println("No");
        }
        return(r);
    }
}

