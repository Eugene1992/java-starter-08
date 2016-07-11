package examples.cw_01;

public class PrimitiveTypes {
    public static void main(String[] args) {
        boolean b1;
        b1 = true;
        System.out.println(b1);
        b1 = false;
        System.out.println(b1);
        boolean b2 = false, b3, b4 = true, b5 = false;

        System.out.println(b2);

        b3 = 10 > 2;

        char c1 = 'f';
        char c2 = 33;
        char c3 = '\u2312';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        byte bb1 = -128;
        byte bb2 = 127;

        short s1 = 32767;
        short s2 = -32768;

        long l1 = 2304046565656565654L;
        long l2 = -2304046565656565654L;

        float f1 = 10.0F;
        float f2 = -10.0F;

        double d1 = 10.0;
        double hello = 10.0;

        System.out.println(hello);


        int i1 = 7;
        int i2 = 3;

        i1 = i2 * 2 + 2;

        int i3 = i1 % i2;

        /*
        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);
        */

        /*System.out.println(i1++);
        System.out.println(++i1);*/

        System.out.println("0010 0110");
        System.out.print("0010 0110");


    }
}
