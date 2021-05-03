package april_2021.practice1;

public class Task8 {

    private static boolean isPalindrome(String string) {
        String reverseSrting = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseSrting = reverseSrting + string.charAt(i);
        }
        return string.equals(reverseSrting);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("1155"));
        System.out.println(isPalindrome("15451"));
        System.out.println(isPalindrome("154451"));
        System.out.println(isPalindrome("134451"));
    }

}
