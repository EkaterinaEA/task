package train1;//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        String string = "Hello World Hello value my love value love love love love";
        String[] words = string.split(" ");
        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i < words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], ++counter);
            } else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }

    public static class Task4 {

        public static void main(String[] args) {
            int a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input values: ");
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println("Values before change. a: " + a + ", b: " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("Values after change. a: " + a + ", b: " + b);
        }

    }
}
