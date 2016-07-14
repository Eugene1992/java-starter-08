package hw3;

/**
 * Created by Тарас on 12.07.2016.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        //Завдання №1
        int start, end, step;
        start = 1000;
        end = 10000;
        step = 3;
        arithmeticProgression(start, end, step);
        int start1, end1, step1;
        start1 = 1;
        end1 = 55;
        step1 = 2;
        arithmeticProgressions(start1, end1, step1);

    }

    static int arithmeticProgression(int start, int end, int step) {
        String res = "";
        for (int i = start; i < end; i = i + step) {
            System.out.println(i + " ");
        }
        return end;
    }
        //Завдання №2
        static int arithmeticProgressions(int start1, int end1, int step1){
        String res1 = "";
        for (int i1 = start1; i1 < end1 * step1; i1 = i1 + step1 ) {
            System.out.println(i1 + " " );
        }
            return end1;
    }
}
