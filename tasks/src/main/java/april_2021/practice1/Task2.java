package april_2021.practice1;

public class Task2 {

    private static String getReverseStringUsingCharAt(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;
    }

    private static String getReverseStringUsingToCharArray(String string) {
        char[] charArray = string.toCharArray();
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + charArray[i];
        }
        return reverseString;
    }

    private static String getReverseStringUsingSplit(String string) {
        String[] stringArray = string.split("");
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + stringArray[i];
        }
        return reverseString;
    }

    public static void main(String[] args) {
        String string = "Hello Java!";
        System.out.println(getReverseStringUsingCharAt(string));
        System.out.println(getReverseStringUsingToCharArray(string));
        System.out.println(getReverseStringUsingSplit(string));
    }
}
