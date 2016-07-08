/**
 * Created by Тарас on 08.07.2016.
 */
public class HomeWork {
    public static void main (String [] args){
        // Завдання №1
        byte a1 = 127;
        byte a2 = -128;

        short b1 = 32767;
        short b2 = -32768;

        int c1 = 2147483647;
        int c2 = -2147483648;

        long d1 = 9223372036854775807L;
        long d2 = -9223372036854775808L;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(d1);
        System.out.println(d2);

        // Завдання №2
        byte e1 = 1;
        byte e2 = 2;
        byte e3 = (byte) (e1 + e2);

        System.out.println(e3);

        // Завдання №3
        short w1 = 1200;
        short w2 = 100;
        short w3 = (short) (w1 - w2);

        System.out.println(w3);

        // Завдання №4
        int q1 = 120000;
        int q2 = 2;
        int q3 = q1 - q2;

        System.out.println(q3);

        // Завдання №5
        long r1 = 120000000000L;
        long r2 = 2;
        long r3 = r1 - r2;

        System.out.println(r3);

        // Завдання №7
        short t1 = 200;
        short t2 = 600;
        byte t3 = 100;
        byte t4 = (byte) ((t1 + t2) / t3);

        System.out.println(t4);
        // Завдання №8
        short y1 = 2200;
        short y2 = 600;
        byte y3 = 100;
        byte y4 = 2;
        int y5 = (y1 / y2) * (y3 / y4);

        System.out.println(y5);

        // Завдання №9
        int u1 = 22;
        int u2 = 78;
        int u3 = 247;
        u1 = (u3 + u2);
        u2 = (u3 + u1);

        System.out.println(u1);
        System.out.println(u2);

        // Завдання №10
        int o1 = 7;
        int o2 = 3;

        o1 = o2 * 8;
        o2 = o1 * 6;

        System.out.println(o1);
        System.out.println(o2);

        //Бонус
        int p = 100;
        int p1 = 2;
        int f = p / p1;
        int f1 = f / p1;
        int f2 = f1 / p1;
        int f3 = f2 / p1;
        int f4 = f3 / p1;
        int f5 = f4 / p1;
        int f6 = f5 / p1;

        int p3 = p % p1;
        int p4 = f % p1;
        int p5 = f1 % p1;
        int p6 = f2 % p1;
        int p7 = f3 % p1;
        int p8 = f4 % p1;
        int p9 = f5 % p1;
        int p10 = f6 % p1;

        System.out.print(p10);
        System.out.print(p9);
        System.out.print(p8);
        System.out.print(p7 + " " + p6);
        System.out.print(p5);
        System.out.print(p4);
        System.out.print(p3);
    }

}

