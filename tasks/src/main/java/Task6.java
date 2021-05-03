//Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {
        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1, "Hello");
        keyValue.put(2, "Hello1");
        keyValue.put(3, "Hello2");
        System.out.println(keyValue.size());

        System.out.println("While loop:");
        Iterator iterator = keyValue.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry current = (Map.Entry) iterator.next();
            System.out.println("Key: " + current.getKey() + ", Value: " + current.getValue());
        }

        System.out.println("For-each circle:");
        for (Map.Entry current : keyValue.entrySet()) {
            System.out.println("Key: " + current.getKey() + ", Value: " + current.getValue());
        }

    }

}
