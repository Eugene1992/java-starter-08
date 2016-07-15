package hw5;

/**
 * Created by Тарас on 15.07.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int z, t;
        z = 000001;
        t = 1000000;
        luckyTicket(z, t);
    }

    static int luckyTicket(int z, int t) {
        int x, x1, x23, x2, x3, y, y1, y23, y2, y3, sumx, sumy, r;
        r = 1;
        for (int i = z; i < t; i++) {
            x = i / 1000;
            x1 = x / 100;
            x23 = x - (x1 * 100);
            x2 = x23 / 10;
            x3 = x23 - (x2 * 10);
            y = i - (x * 1000);
            y1 = y / 100;
            y23 = y - (y1 * 100);
            y2 = y23 / 10;
            y3 = y23 - (y2 * 10);
            sumx = x1 + x2 + x3;
            sumy = y1 + y2 + y3;
            if (sumx != sumy) continue;{
                r++;
            }
            }
        System.out.println(r);
        return z;
    }
}
