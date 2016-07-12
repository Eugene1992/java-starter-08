package examples.cw_04;

/**
 * Created by Student on 7/12/2016.
 */
public class InnerLoops {
    public static void main(String[] args) throws InterruptedException {

        taras:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            yura:
            for (int j = 0; j < 10; j++) {
                Thread.sleep(1000);
                System.out.print(j);
                if (j == 5) continue taras;
            }
            System.out.println();
        }
    }
}
