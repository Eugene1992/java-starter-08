/**
 * Created by shast on 7/11/2016.
 */
public class while1 {
    public static void main(String[] args) {
        int i, i1, b;
        String res = "";
        i = 103;
        i1 = 2;
        while (i >= 1) {
            b = i % 2;
            i = i / 2;
            if (i == 1) {
                res = 1 + res;
            }else{
                res = b + res;
            }
        }
        System.out.println(res);
    }
}
