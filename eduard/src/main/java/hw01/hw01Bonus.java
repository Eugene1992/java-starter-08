package hw01;

public class hw01Bonus {
    public static void main(String[] args) {

        byte i = 127;
        byte b7 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b6 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b5 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b4 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b3 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b2 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b1 = (byte) (i % 2);
        i = (byte) (i / 2);
        byte b0 = (byte) (i % 2);

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
