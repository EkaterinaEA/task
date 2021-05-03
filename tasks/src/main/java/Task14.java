//Напишите Java-программу для удаления всех пробелов из строки с помощью replace().

public class Task14 {

    public static String replaceSpace(String string) {
        return string.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("       Hello!  love  "));
    }
}
