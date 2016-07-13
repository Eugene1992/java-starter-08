package examples.cw_04;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 45) break;
            System.out.print(i + " ");
        }

        System.out.println("End");
    }
}
