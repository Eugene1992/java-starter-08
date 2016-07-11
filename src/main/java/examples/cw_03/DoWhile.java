package examples.cw_03;

/**
 * Created by Student on 7/11/2016.
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 10;

        while (i < 10){
            System.out.println("Simple while");
            i++;
        }

        do {
            System.out.println("Do while");
            //i++;
        } while (i < 10);
    }
}

