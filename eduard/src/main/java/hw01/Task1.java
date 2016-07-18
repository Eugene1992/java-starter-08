package hw01;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println();
        makeNumbers();
    }

    public static void makeNumbers() {
        /*
        Инициализировать переменную типа byte результатом суммы двух любых чисел
         */
        byte b = 14;
        byte b1;
        b1 = (byte) (b + 15);
        /*
        Инициализировать переменную типа short  результатом вычитания двух любых чисел
         */
        short s = 153;
        short s1;
        s1 = (short) (s - 45);
        /*
        Инициализировать переменную типа int результатом деления двух любых чисел
         */
        int i = 1783;
        int i1;
        i1 = (i / 4);
        /*
        Инициализировать переменную типа long результатом умножения двух любых чисел
         */
        long l = 19075L;
        long l1;
        l1 = (l * 33);

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        /*
        Передать переменной типа byte результат суммы двух переменных типа byte
         */
        b = (byte) (b + b1);
        System.out.println(b);
        /*
        Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
         */
        b1 = (byte) ((s1 + s) / b1);
        System.out.println(b1);
        /*
        Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
         */
        i = ((s / s1) * (b / b1));
        System.out.println(i);
        /*
        Поменять значения двух целочисленных переменных используя третью
         */
        l = b1 = b;
        System.out.println(l);
        System.out.println(b1);
        /*
        Поменять значения двух переменных без использования третей
         */
        l = l1 = 568997L;
        System.out.println(l);
        System.out.println(l1);


    }

}


