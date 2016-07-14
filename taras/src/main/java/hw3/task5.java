package hw3;

/**
 * Created by Тарас on 12.07.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        //Завдання №5
        int a, b, sum, end, r;
        a = 1;
        b = 1;
        sum(a, b);
    }
        static int sum(int a, int b){
        int sum, end, r;
            sum = 0;
            end = 20;
            r = 1;
            String res = "";
            for (int i = a; r < end; i = a + b) {
                sum = a + b;
                b = a;
                a = sum;
                System.out.println(i + " ");
                r++;
            }
            return end;
        }
    }
