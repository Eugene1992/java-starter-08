package hw03;

public class DecimalToOctal {
    public static void main(int a) {
        int i;
        String res = "";
        char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while(a > 0) {
            i = a % 8;
            res = dig[i] + res;
            a = a / 8;
        }
        System.out.println("Перевод из 10й в 8-ую " + res);

    }

}
