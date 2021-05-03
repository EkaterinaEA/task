package april_2021.practice1;

import java.util.HashMap;

public class Task5 {

    private static void countWords(String string) {
        String[] stringArray = string.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            if (map.containsKey(stringArray[i])) {
                int count = map.get(stringArray[i]);
                map.put(stringArray[i], ++count);
            } else {
                map.put(stringArray[i], 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        countWords("My favorite language is Java java Java My is is");
    }

}
