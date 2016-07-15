package hw5;

/**
 * Created by shast on 7/15/2016.
 */
public class Hw5_1 {
    public static void main(String[] args) {
        System.out.println(time());
    }

    static int time() {
        int x1, x2, y1, y2, r;
        r = 1;
        for (int i = 0; i < 24; i++) {
            for (int y = 0; y < 60; y++) {
                x1 = i / 10;
                x2 = i - (x1 * 10);
                y1 = y / 10;
                y2 = y - (y1 * 10);
                if (x2 != y1 || x1 != y2) continue;
                {r++;}
            }
        }
        return r;
    }
}


