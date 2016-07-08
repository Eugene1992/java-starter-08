package hw01;

public class hw01Bonus {
    public static void main(String[] args) {

        int i = 127;
        int b7 = i % 2;
        i = i / 2;
        int b6 = i % 2;
        i =  i / 2;
        int b5 = i % 2;
        i = i / 2;
        int b4 = i % 2;
        i = i / 2;
        int b3 = i % 2;
        i = i / 2;
        int b2 = i % 2;
        i = i / 2;
        int b1 = i % 2;
        i = i / 2;
        int b0 = i % 2;

        System.out.print(b0);
        System.out.print(b1);
        System.out.print(b2);
        System.out.print(b3);
        System.out.print(" ");
        System.out.print(b4);
        System.out.print(b5);
        System.out.print(b6);
        System.out.print(b7);
    }
}