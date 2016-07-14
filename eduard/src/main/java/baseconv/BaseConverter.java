package baseconv;
import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, base, b, o, h;
        System.out.println("Введите число");
        num = scan.nextInt();
        System.out.println("Выберите базу: ");
        System.out.println("Для выбора двоичной, введите b");
        System.out.println("Для выбора восьмеричной, введите o");
        System.out.println("Для выбора шестнадцатеричной, введите h");
    }
}
