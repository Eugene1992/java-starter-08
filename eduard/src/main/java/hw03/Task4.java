package hw03;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task 4");
        System.out.println();
        makeGeomProgression();
    }
    public static void makeGeomProgression() {
        for(int i = 2; i <= 1_048_576; i = i * 2) {
            System.out.print(i + " ");
        }
    }
}
