package april_2021;

public class Task8 {

    private static boolean isPalindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return string.equals(reverseString);
    }

    private static boolean isPalindrome(int num) {
        return isPalindrome(String.valueOf(num));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("tollot"));
        System.out.println(isPalindrome("tolot"));
        System.out.println(isPalindrome("toloot"));
        System.out.println(isPalindrome(657));
        System.out.println(isPalindrome(6556));
    }

}
