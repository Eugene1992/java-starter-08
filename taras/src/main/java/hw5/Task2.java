package hw5;

/**
 * Created by Тарас on 15.07.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        int hours, moments;
        hours = 0;
        moments = 0;
        time(hours, moments);
    }

    static int time(int hours, int moments) {
        int x, x1, x2, y1, y2, r;
        r = 1;
        for (int i = hours; i < 24; i++) {
            for (int y = moments; y < 60; y++) {
                x1 = i / 10;
                x2 = i - (x1 * 10);
                y1 = y / 10;
                y2 = y - (y1 * 10);

                if (x2 != y1 || x1 != y2) continue;
                {
                    r++;
                }
            }
        }
        System.out.println(r);
        return hours;
    }
}
