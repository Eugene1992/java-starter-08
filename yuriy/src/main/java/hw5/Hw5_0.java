package hw5;

/**
 * Created by shast on 7/15/2016.
 */
public class Hw5_0 {
    public static void main(String[] args) {
        int start;
        start = 999_999;
        System.out.println(ticket(start));
    }

    static String ticket(int start) {
        int a, firstNumber, b, secondNumber, c, thirdNumber, d, fourthNumber, e, fifthNumber, f, sixthNumber, sum1, sum2;
        int w = 1;
        for (int i = 000000; i <= start; i++) {
            a = start / 100_000;
            firstNumber = a;
            b = start / 10_000;
            secondNumber = b - (firstNumber * 10);
            c = start / 1000;
            thirdNumber = c - (b * 10);
            d = start / 100;
            fourthNumber = d - (c * 10);
            e = start / 10;
            fifthNumber = e - (d * 10);
            sixthNumber = start - (e * 10);
            sum1 = firstNumber + secondNumber + thirdNumber;
            sum2 = fourthNumber + fifthNumber + sixthNumber;
            start--;
            if (sum1 == sum2){
                w++;
            }else continue;
            }
        return "Кількість: " + w;
            }
        }



