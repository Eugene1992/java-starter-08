package examples.cw_02;

/**
 * Created by Student on 7/8/2016.
 */
public class SwitchOperator {
    public static void main(String[] args) {
        int age = 12;

        if (age == 18){
            System.out.println("18");
        }

        if (age == 60){
            System.out.println("sasa");
        }

        switch (age){
            case 18:
                System.out.println("18");
                System.out.println();
            break;

            case 12:
               switch (age){
                   case 12:
                       System.out.println("Inner switch");
                   break;
               }
            break;

            default:
                System.out.println("Default");
        }
    }
}
