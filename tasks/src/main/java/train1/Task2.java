package train1;//Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse()

public class Task2 {

    public static void main(String[] args) {
        String string = "Hello World!";
        char[] stringChars = string.toCharArray();
        for (int i = stringChars.length - 1; i >= 0; i--) {
            System.out.print(stringChars[i]);
        }
    }

}
