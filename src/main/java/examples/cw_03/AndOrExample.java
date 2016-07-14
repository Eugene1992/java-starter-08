package examples.cw_03;

/**
 * Created by Student on 7/11/2016.
 */
public class AndOrExample {
    public static void main(String[] args) {
        int i1= 300, i2 = 4, i3 = 105, i4 = 100;

        if (i1 > i2 && i1 > i3 && i1 > i4 ){ // logic AND
            if (i2 > i3 && i2 > i4){
                System.out.println(i2);
            }
            if (i3 > i2 && i3 > i4){
                System.out.println(i3);
            }
            if (i4 > i3 && i4 > i2){
                System.out.println(i4);
            }
        }

       /* if (i1 > 100 || i1 / 0 == 20){ //logic OR  true x false = true
            System.out.println(i1);
        }

        if (i1 < 100 && i1 / 0 == 20 || i1 != 100){ //logic AND  true x false = false
            System.out.println(i1);
        }

        /*boolean b = true;

        if (!(i1 > 100)){ //logic NOT
            System.out.println(b);
        }*/


    }
}