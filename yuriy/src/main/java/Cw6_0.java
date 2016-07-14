/**
 * Created by shast on 7/13/2016.
 */
public class Cw6_0 {
    public static void main(String[] args) {
        String t = "Taras";
        int i = 5;
        int a, b;
        a = 2;
        b = 4;
        returnNumber(a , b);
    }
    /*static void nameTaras(String t, int i) {
        for (int a = 0; a < i; a++)
            System.out.println(t + " " + i);*/

    static int returnNumber(int a, int b) {
        int res = 1;
        for (int i = 0; i < b; i++) {
            res = a * res;
            //res *= a;
        }System.out.println(res);
        return res;
    }
}






