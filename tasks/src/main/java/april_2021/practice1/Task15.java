package april_2021.practice1;

public class Task15 {

    private static String replaceWhitespace(String string) {
        char[] charArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char i : charArray) {
            if (i != ' ' && i != '\t') {
                stringBuilder.append(i);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceWhitespace(" djeuig eg    rnwoirg "));
    }

}
