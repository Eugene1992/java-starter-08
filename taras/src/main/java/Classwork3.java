import java.util.ArrayList;

/**
 * Created by Тарас on 08.07.2016.
 */
public class Classwork3 {
    public static void main (String [] args){
        int i = 1010001;
        int i0 = i / 10000000;
        int i1 = i / 1000000 % 10;
        int i2 = i / 100000 % 10;
        int i3 = i / 10000 % 10;
        int i4 = i / 1000 % 10;
        int i5 = i / 100 % 10;
        int i6 = i / 10 % 10;
        int i7 = i % 10;

        System.out.print(i7);
        System.out.print(i6);
        System.out.print(i5);
        System.out.print(i4);
        System.out.print(i3);
        System.out.print(i2);
        System.out.print(i1);
        System.out.print(i0);
        int res = 0;
        res = res + i7 + i6 * 2 + i5 * 4 + i4 * 8 + i3 * 16 + i2 * 32 + i1 * 64 + i0 * 128;

        System.out.println();
        System.out.println(res);
    }

}