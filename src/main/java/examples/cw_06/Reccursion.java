package examples.cw_06;

/**
 * Created by Student on 7/14/2016.
 */
public class Reccursion {
    public static void main(String[] args) {
        //getFibNum(5);
        System.out.println(getFact(6));
    }

    static int getFibNum(int num){
        System.out.print(num + " ");
        if (num < 2) return num;
        int left = getFibNum(num - 2);
        int right = getFibNum(num - 1);
        return left + right;
    }

    static int getFact(int num){
        return (num == 1) ? num : num * getFact(num - 1);
    }
}
