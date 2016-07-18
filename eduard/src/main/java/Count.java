public class Count {
    public static void main(String[] args) {
        System.out.println("Counter");
        System.out.println();
        countForMe();
    }

    public static void countForMe() {
        for (int i = 0; i < 52; i = i + 2) {
            System.out.println(i + " ");
        }
    }
}
