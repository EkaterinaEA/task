package train1;//Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for.

import java.util.ArrayList;
import java.util.Iterator;

public class Task10 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(56);
        list.add(23);
        list.add(9);
        Iterator iterator = list.iterator();

        System.out.println("while");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("for-each");
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
