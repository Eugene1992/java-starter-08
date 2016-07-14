package hw4;

/**
 * Created by Тарас on 13.07.2016.
 */
public class Hw4_1 {
    //Chess Board
    public static void main(String[] args) {
        int a , b, c, i, d;
        a = 1;
        b = 1;
        c = 1;
        i = 1;
        d = 1;
        chessBoard(a, b, c, i, d);
    }
    static int chessBoard(int a, int b, int c, int i, int d){
        for (int q = a; q < 5; q++) {
            for (int w = b; w < 5; w++) {
                for (int e = c; e < 5; e++) {
                    for (int r = i; r < 5; r++) {
                        System.out.print("Ж ");
                    }
                    for (int t = d; t < 5; t++) {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
            for (int w = b; w < 5; w++) {
                for (int e = c; e < 5; e++) {
                    for (int r = i; r < 5; r++) {
                        System.out.print("- ");
                    }
                    for (int t = d; t < 5; t++) {
                        System.out.print("Ж ");
                    }
                }
                System.out.println();
            }
        }
        return a;
    }
}