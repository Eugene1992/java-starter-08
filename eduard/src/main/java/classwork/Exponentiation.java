package classwork;

public class Exponentiation {
    public static void main(String[] args) {

       // int i = Math.pow()

        System.out.println(exponent(2, 3));
        System.out.println(exponent(2, 6));

        int k = exponent(2, exponent(2, 3));

        System.out.println(k);
    }

    public static int exponent (int num, int exp) {
        int res = num;

        for (int i = 1; i < exp; i++) {
            res = res * num;
        }
        return res;
    }
}
