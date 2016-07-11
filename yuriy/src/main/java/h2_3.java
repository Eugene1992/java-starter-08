/**
 * Created by shast on 7/11/2016.
 */
public class h2_3 {
    public static void main(String[] args) {
        double a1, b2, c3, d, r, x1, x2;
        a1 = 6.2;
        b2 = 9.4;
        c3 = 8.9;

        d = (b2 * b2) - 4 * a1 * c3;
        r = Math.sqrt(d);
        x1 = (-b2 - r) / 2 * a1;
        x2 = (-b2 + r) / 2 * a1;

        if (r > 0) {
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.print("None");

        }
    }
}





