package exercise1;

public class Victory {

    public static void printPattern(String pattern)

    {
        for (int i = 0; i <= 21; i++) {
            System.out.print(pattern);
        }
    }

    public static void main(String[] args) {

        printPattern("/");
        System.out.println("\n|| Victory is mine ||");
        printPattern("\\");

    }
}
