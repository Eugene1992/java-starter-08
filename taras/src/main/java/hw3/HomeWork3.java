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
        String res = "";
        for (int i = start; i < end; i = i + step ) {
            System.out.println(i + " " );
        }
        //Завдання №2
        int start1, end1, step1;
        start1 = 1;
        end1 = 55;
        step1 = 2;
        String res1 = "";
        for (int i1 = start1; i1 < end1 * step1; i1 = i1 + step1 ) {
            System.out.println(i1 + " " );
        }
    }
}
