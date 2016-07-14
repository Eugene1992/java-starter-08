package examples.cw_06;

public class MethodsOverload {
    public static void main(String[] args) {
           print("Hello");
           print(23);
           print("Hello", 20);
    }

    static void print(int i){
        System.out.println("1");
    }

    static void print(String s){
        System.out.println("2");
    }

    static void print(String s, int i){
        System.out.println("3");
    }

    static void print(int i, String s){
        System.out.println("4");
    }
}
