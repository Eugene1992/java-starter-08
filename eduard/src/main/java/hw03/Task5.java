package hw03;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task 5");
        System.out.println();
        makeFibbo();
    }
    public static void makeFibbo() {
        int a = 0;
        for(int i = 1; i <= 6765; i = i + a) {
            a += i;
            System.out.println(i);
            System.out.println(a);
        }
    }

}
