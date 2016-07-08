package examples.cw_02;

/**
 * Created by Student on 7/8/2016.
 */
public class TernarOperator {
    public static void main(String[] args) {
        int i;
        int k = 10;

        if (k == 20){
            if (k < 10) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }


        i = k == 20 ? k < 10 ? 2 : 1 : 0;


    }
}
