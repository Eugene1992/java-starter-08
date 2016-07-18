package hw03;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println();
        makeArithmProgression();

    }
    public static void makeArithmProgression() {
        for(int a = 1000; a <= 2000; a = a + 3) {
            System.out.print(a + " ");
        }
    }
}
