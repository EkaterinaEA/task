// Напишите программу на Java, чтобы найти повторяющиеся символы в строке.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11 {

    public static void getDuplicate(String string) {
        String[] stringArray = string.split("");
        Map<Object, Long> map = Arrays.stream(stringArray).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }

    public static void getDuplicateUsingMap(String string) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < string.length(); i++) {
            String c = String.valueOf(string.charAt(i));
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        getDuplicate("Hello World l");
        getDuplicateUsingMap("Hello World l");
    }

}
