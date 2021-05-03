import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) {
        String mainString;
        String reverseString = "";
        System.out.println("Please input string:");
        Scanner scanner = new Scanner(System.in);
        mainString = scanner.nextLine();
        for (int i = mainString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + mainString.charAt(i);
        }
        System.out.println(reverseString);
    }

}
