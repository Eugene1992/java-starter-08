package baseconv;

public class DecimalToHex {
    public static void main(int a) {
        int i;
        char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String res = "";
        while (a != 0) {
            i = a % 16;
            res = dig[i] + res;
            a = a / 16;
        }
        System.out.println("Перевод из 10-й в 16-ую " + res);
    }

}
