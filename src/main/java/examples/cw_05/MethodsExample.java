package examples.cw_05;

/**
 * Created by Student on 7/13/2016.
 */
public class MethodsExample {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(getSomeString());
        System.out.println("End");

        String s = "Taras";

        printString("Hello world!");
        //printString(233);
        printString(s);
    }

    static String getSomeString(){
        return "Hello";
    }

    static void printString(String s){
        System.out.println(s);
    }
}
