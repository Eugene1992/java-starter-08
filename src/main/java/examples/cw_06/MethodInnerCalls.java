package examples.cw_06;

/**
 * Created by Student on 7/14/2016.
 */
public class MethodInnerCalls {
    public static void main(String[] args) {
        int c = getDiskr(2, 4, 6);
        System.out.println(c);
    }

    public static int exponent (int num, int exp) {
        int res = num;

        for (int i = 1; i < exp; i++) {
            res = res * num;
        }
        return res;
    }

    public static int getDiskr(int a, int b, int c){
        int d = exponent(b, 2) - 4 * a * c;
        System.out.println(d);
        return 0;
    }
}
