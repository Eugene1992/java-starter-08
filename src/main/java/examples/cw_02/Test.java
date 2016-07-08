package examples.cw_02;

/**
 * Created by Student on 7/8/2016.
 */
public class Test {
    public static void main(String[] args) {
       boolean b = 20 == 45;
        int i = 4;

       if (i > 6){ // > < == != <= >=
           if (i < 12){
               System.out.println("6 < i < 10");
           } else {
               System.out.println("i > 6");
           }
           System.out.println("True");
       } else if (i == 4){
           System.out.println("i == 4");
       }
    }


}
