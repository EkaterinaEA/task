//Напишите Java-программу для удаления всех пробелов из строки без использования replace().

public class Task15 {
    public static void main(String[] args) {
        String string = "kjnksjr ksjf     sjfs jnef  ";
        char[] array = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : array) {
            if (c != ' ' && c != '\t') {
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
    }
}
