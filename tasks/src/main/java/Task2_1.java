//Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse()

import java.util.Scanner;

public class Task2_1 {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string:");
        string = scanner.nextLine();
        String[] stringChars = string.split("");
        for (int i = stringChars.length - 1; i >= 0; i--) {
            System.out.print(stringChars[i]);
        }
    }
}
