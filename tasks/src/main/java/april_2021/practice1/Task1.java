package april_2021.practice1;

public class Task1 {

    private static String getReverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(getReverseString("Hello World!"));
        System.out.println(getReverseString("I love Java"));
    }

}
