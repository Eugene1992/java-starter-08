package hw03;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3");
        System.out.println();
        makeArithmProgression();

    }
    public static void makeArithmProgression() {

        for (int i = 90; i >= 5; i = i - 5) {
            System.out.print(i + " ");
        }
    }
}
