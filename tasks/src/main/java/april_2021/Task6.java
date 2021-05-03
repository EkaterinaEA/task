package april_2021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("");

        for (Map.Entry<Integer, String> keyValue : map.entrySet()) {
            System.out.println(keyValue);
        }

    }

}
