package examples.cw_07;

/**
 * Created by Student on 7/15/2016.
 */
public class ArrayExample {
    public static void main(String[] args) {
        //                      0   1  2  3  4   5  6   7
        int[] array = new int[]{2, -2, 5, 1, 23, 4, 6, -12};
        int length = array.length;

        System.out.println(array[7]);
        //System.out.println(array[8]);

        System.out.println(length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
