//Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет.

import java.util.Scanner;

public class Task8 {

    static String reverse = "";

    public static boolean isPalindrome(String source) {
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        System.out.println(reverse);
        return source.equals(reverse);
    }

    public static void main(String[] args) {
        String source;
        Scanner scanner = new Scanner(System.in);
        source = scanner.nextLine();
        System.out.println(source + " - is Palindrome - " + isPalindrome(source));
    }

}
