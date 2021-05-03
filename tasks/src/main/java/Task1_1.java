//Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций

public class Task1_1 {

    public static void main(String[] args) {
        String stringSource = "jfvdkjfv";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringSource);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
