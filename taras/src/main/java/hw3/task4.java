package hw3;

/**
 * Created by Тарас on 12.07.2016.
 */
public class task4 {
    public static void main(String[] args) {
        //Завдання №4
        int start, end, step, r;
        start = 2;
        step = 2;
        r = 1;
        end = 20;
        String res = "";
        for (int i = start; r < end; i = i * step) {
            System.out.println(i + " ");
            r++;
        }
        }
    }
