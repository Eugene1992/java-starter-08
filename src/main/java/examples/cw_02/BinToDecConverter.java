package examples.cw_02;

/**
 * Created by Student on 7/8/2016.
 */
public class BinToDecConverter {
    public static void main(String[] args) {
        int i = 1101_0011;

        int b0, b1, b2, b3, b4, b5, b6, b7, res = 0;

        b7 = i / 10000000;
        b6 = i / 1000000 % 10;
        b5 = i / 100000 % 10;
        b4 = i / 10000 % 10;
        b3 = i / 1000 % 10;
        b2 = i / 100 % 10;
        b1 = i / 10 % 10;
        b0 = i % 10;

        System.out.print(b7);
        System.out.print(b6);
        System.out.print(b5);
        System.out.print(b4);
        System.out.print(b3);
        System.out.print(b2);
        System.out.print(b1);
        System.out.print(b0);

        res = res + b0 + b1 * 2 + b2 * 4 + b3 * 8 + b4 * 16 + b5 * 32 + b6 * 64 + b7 * 128;

        System.out.println();
        System.out.println(res);

        int MY_VARIABLE = 10;

        MY_VARIABLE = 15;
    }
}
