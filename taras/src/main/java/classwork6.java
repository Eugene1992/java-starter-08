/**
 * Created by Тарас on 13.07.2016.
 */
public class Classwork6 {
    public static void main(String[] args) {
        int a = 3;
        int i = 3;
        taras(a, i);
    }

    static int taras(int a, int i) {
        int a1 = 1;
        for (int d = 0; d < i; d++) {
            a1 = a * a1;
        }
        System.out.println(a1);
        return a;

    }
}
