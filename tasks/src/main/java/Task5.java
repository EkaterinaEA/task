//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.

import java.util.HashMap;

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

}
