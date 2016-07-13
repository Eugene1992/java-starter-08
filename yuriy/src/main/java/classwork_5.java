/**
 * Created by shast on 7/12/2016.
 */
import java.util.Scanner;
public class classwork_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int i, a, b, start, stop, sum;

        String input;
        stop = 1;

        for (;;) {
                System.out.print("Введіть число: ");
                int rand = (int) (Math.random()*9);
                i = scan.nextInt();

                /*if (input.equals("exit"))
                    System.out.println("Good bye!");
                    break;*/

                if (i == rand){
                    System.out.println("Yeah");
                    //System.out.println();
                    break;
                }stop++;
        }
        System.out.println("Ви вгадали з " + stop);
    }
}//int inputNum = Integer.parseInt(input);
