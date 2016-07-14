package hw03;

public class Task5 {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 1; i <= 6765; i = i + a) {
            a += i;
            System.out.println(i);
            System.out.println(a);
        }
    }

}
