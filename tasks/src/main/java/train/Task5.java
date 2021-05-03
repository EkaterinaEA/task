package train;

import java.util.HashMap;

public class Task5 {

    public static void main(String[] args) {
        String string = "Hello hello Hello Java java Java ";
        String[] stringArray = string.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= stringArray.length - 1; i++) {
            if (map.containsKey(stringArray[i])) {
                int count = map.get(stringArray[i]);
                map.put(stringArray[i], ++count);
            } else {
                map.put(stringArray[i], 1);
            }
        }
        System.out.println(map);
    }

}
