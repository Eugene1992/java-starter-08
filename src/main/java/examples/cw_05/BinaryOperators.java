package examples.cw_05;

/**
 * Created by Student on 7/13/2016.
 */
public class BinaryOperators {
    public static void main(String[] args) {
        int i = 16;
        int j = 8;

        /*
            1 & 1 = 1
            0 & 0 = 0
            1 & 0 = 0
            0 & 1 = 0

            0000 1010
           &
            0000 1000
            ---------
            0000 1000
        */

        System.out.println("10 % 8 = " + (10 & 8));

        /*
         1 | 1 = 1
         0 | 0 = 0
         1 | 0 = 1
         0 | 1 = 1

          0000 1010
         |
          0000 1000
          ---------
          0000 1010
        */

        System.out.println("10 | 8 = " + (10 | 8));

        /*
         true^true= false
         true^ false= true
         false^ false= false
         false^true= true
        */

        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);

        /*
          1 ^ 1 = 0
          0 ^ 0 = 0
          1 ^ 0 = 1
          0 ^ 1 = 1

          0000 1010
         ^
          0000 1000
          ---------
          0000 0010
        */

        System.out.println("10 ^ 8 = " + (10 ^ 8));

        System.out.println(!true);
        System.out.println(!false);

        /*
            0000 1000
          ~ ---------
            1111 0111
        */

        System.out.println("~8 = " + (~8));

        //i ^= (j ^= i);
        //j ^= i;

        System.out.println(i);
        System.out.println(j);

        /*
             0000 1000
          << ---------
             0010 0000
        */

        //byte b1 = 253;

        System.out.println(253<<2); // << 2  =  *4
        System.out.println(-127>>2); // >> 2  =  /4
    }
}
