package april_2021;

import java.util.HashMap;

public class Task5 {

    public static void main(String[] args) {
        String string = "Hello hello Java Hello java hello Java Java";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] stringArray = string.split(" ");
        for (String s : stringArray) {
            if (hashMap.containsKey(s)) {
                int count = hashMap.get(s);
                hashMap.put(s, ++count);
            } else {
                hashMap.put(s, 1);
            }
        }
        System.out.println(hashMap);
    }

}
