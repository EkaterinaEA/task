package april_2021;

public class Task2 {


    private static String getReserseStringUsingToCharArray(String string) {
        char[] charArray = string.toCharArray();
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + charArray[i];
        }
        return reverseString.toString();
    }

    private static String getReverseStringUsingSplit(String string) {
        String[] stringArray = string.split("");
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + stringArray[i];
        }
        return reverseString;
    }

    private static String getReverseStringUsingCharAt(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        System.out.println(getReserseStringUsingToCharArray("Hello, my lovely Java!"));
        System.out.println(getReverseStringUsingSplit("Hello, my lovely Java!"));
        System.out.println(getReverseStringUsingCharAt("Hello, my lovely Java!"));
    }

}
