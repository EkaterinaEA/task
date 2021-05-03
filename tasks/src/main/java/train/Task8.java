package train;

public class Task8 {

    private static boolean isPalindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return string.equals(reverseString);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rrrkkk"));
        System.out.println(isPalindrome("akka"));

    }
}
