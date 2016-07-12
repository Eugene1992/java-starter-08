package hw3;

/**
 * Created by Тарас on 12.07.2016.
 */
public class task3 {
    public static void main(String[] args) {
        //Завдання №3
        int start, end, step;
        start = 90;
        end = 0;
        step = 5;
        String res = "";
        for (int i = start; i > end; i = i - step ) {
            System.out.println(i + " " );
        }
    }
}
