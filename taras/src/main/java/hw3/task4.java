package hw3;

/**
 * Created by Тарас on 12.07.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        //Завдання №4
        int start, end, step;
        start = 2;
        step = 2;
        end = 20;
        geometricProgression(start, step, end);
    }
    static int geometricProgression(int start, int step, int end){
        String res = "";
        int r = 1;
        for (int i = start; r < end; i = i * step) {
            System.out.println(i + " ");
            r++;
        }
        return r;
        }
    }
