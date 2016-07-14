package classwork;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand, steps = 0;
        String input;
        boolean win = false;
        do {
            steps++;
            rand = (int) (Math.random() * 5);
            System.out.println("Введите число от 1 до 5:");
            input = scan.next();
            if (input.equals("exit")) {
                System.out.println("Сходи выпей пива и приходи обратно.");
                break;
            } else {
                int inputNum = Integer.parseInt(input);
                if (inputNum == rand) {
                    win = true;
                    System.out.println("Ты угадал с " + steps + " попытки!");
                }
            }
        } while (win != true);
    }
}
