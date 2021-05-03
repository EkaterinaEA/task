package april_2021.practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11 {

    private static void getDuplicateCharactersUsingStream(String string) {
        String[] stringArray = string.split("");
        Map<Object, Long> map = Arrays.stream(stringArray).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }

    private static void getDuplicateCharactersUsingMap(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                int counter = map.get(string.charAt(i));
                map.put(string.charAt(i), ++counter);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String string = "Hello Java hellllo!";
        getDuplicateCharactersUsingStream(string);
        System.out.println();
        getDuplicateCharactersUsingMap(string);
    }

}
