package hw02;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task 6");
        System.out.println();
        makeSqrRoot();

    }
    public static void makeSqrRoot(){
        double a, b, c, d, e, f, g;
        a = 1;
        b = 9.6;
        c = -20;
        d = (b * b) - (4 * a * c);
        g = Math.sqrt(d);

        if (d == 0) {
            e = 1 * (b / (2 * a));
            System.out.println("Есть один квадратный корень равный " + e);
        } else {
            if (d > 0) {
                e = ((-b) + g) / (2 * a);
                f = ((-b) - g) / (2 * a);
                System.out.println("Есть два квадратных корня " + e + " и " + f);
            } else {
                System.out.println("Нет ни одного квадратного корня");

            }
        }
    }
}
