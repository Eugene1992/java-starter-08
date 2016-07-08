/**
 * Created by Юра on 7/8/2016.
 */
public class hw1 {
    public static void main(String[] args) {
        // Assign #1
        byte a1 = 127;
        short b1 = 32767;
        int c1 = 2147483647;
        long d1 = 123456789854985L;

        // Assign #2
        byte m1 = 90;
        byte m2 = 37;
        byte m3 = (byte) (m1 + m2);


        // Assign #3
        short s1 = 22;
        short s2 = 23;
        short i2 = (short) (s1 + s2);

        // Assign #4
        int f1 = 3434;
        int f2 = 656;
        int f3 = f1 + f2;

        // Assign #5
        long l1 = 23234L;
        long l2 = 354345L;
        long l3 = l1 + l2;

        // Assign #6


        // Assign #7
        // приведение типов http://developer.alexanderklimov.ru/android/java/types.php
        short ss1= 55;
        short ss2 = 785;
        byte bb1 = 127;

        byte bb2 = (byte)((ss1 + ss2) / bb1);

        // Assign #8
        short sh1 = 250;
        short sh2 = 50;
        byte bb3 = 40;
        byte bb4 = 30;

        int i3 = (sh1 / sh2) * (bb3 / bb4);

        // Assign #9
        int ii1 = 10;
        int ii2 = 20;
        int ii3 = 50;

        ii1 = (ii1 + ii3);
        ii2 = (ii3 + ii2);

        // Assign #10
        int n1 = 10;
        int n2 = 30;

        n1 = n2 + 2;
        n2 = n1 + 5;

        System.out.println(d1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(m3);
        System.out.println(i2);
        System.out.println(f3);
        System.out.println(l3);
        System.out.println(bb2);
        System.out.println(i3);
        System.out.println(ii1);
        System.out.println(ii2);
        System.out.println(n1);
        System.out.println(n2);

        // Assign BONUS
        int i = 103;
        int i1 = 2;

        int d = i / i1;
        int db1 = d / i1;
        int d2 = db1 / i1;
        int d3 = d2 / i1;
        int d4 = d3 / i1;
        int d5 = d4 / i1;
        int d6 = d5 / i1;

        int ib3 = i % i1;
        int i4 = d % i1;
        int i5 = db1 % i1;
        int i6 = d2 % i1;
        int i7 = d3 % i1;
        int i8 = d4 % i1;
        int i9 = d5 % i1;
        int i10 = d6 % i1;

        System.out.print(i10);
        System.out.print(i9);
        System.out.print(i8);
        System.out.print(i7 +" "+ i6);
        //System.out.print(i6);
        System.out.print(i5);
        System.out.print(i4);
        System.out.print(ib3);
    }

}
