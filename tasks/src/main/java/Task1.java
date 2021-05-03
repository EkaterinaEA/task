//Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций

public class Task1 {

    private final static String string = "jfbawqw";

    public static String getReverseString(String stringSource) {
        StringBuilder stringBuilder = new StringBuilder(stringSource);
        //  stringBuilder.append(stringSource);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(getReverseString(string));
    }

}
