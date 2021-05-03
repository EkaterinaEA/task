package train;

public class Task2 {

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

    private static String getReverseStringUsingCharAt(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        System.out.println("get Reverse String Using ToCharArray: " + getReverseStringUsingToCharArray("Hello KDlsd Java"));
        System.out.println("get Reverse String Using Split: " + getReverseStringUsingSplit("Hello KDlsd Java"));
        System.out.println("get Reverse String Using CharAt: " + getReverseStringUsingCharAt("Hello KDlsd Java"));
    }
}
