package train;

public class Task1 {

    public static String getReverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(getReverseString("Hello KDlsd Java"));
    }
}
