package april_2021.practice1;

import java.util.HashMap;
import java.util.Iterator;

public class Task6 {

    private static void iterateHashMapUsingForEachLoop(HashMap hashMap) {
        for (Object keyValue : hashMap.entrySet()) {
            System.out.println(keyValue);
        }
    }

    private static void iterateHashMapUsingWhileLoop(HashMap hashMap) {
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        iterateHashMapUsingWhileLoop(map);
        iterateHashMapUsingForEachLoop(map);
    }

}
