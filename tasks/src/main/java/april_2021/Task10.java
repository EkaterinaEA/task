package april_2021;

import java.util.ArrayList;
import java.util.Iterator;

public class Task10 {

    private static void traverseArrayListByForLoop(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " ");
        }
    }

    private static void traverseArrayListByForEachLoop(ArrayList arrayList) {
        for (Object i : arrayList) {
            System.out.println(i.toString() + " ");
        }
    }

    private static void traverseArrayListByWhileLoop(ArrayList arrayList) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        System.out.println("traverseArrayListByForLoop: ");
        traverseArrayListByForLoop(arrayList);

        System.out.println("traverseArrayListByForEachLoop: ");
        traverseArrayListByForEachLoop(arrayList);

        System.out.println("traverseArrayListByWhileLoop: ");
        traverseArrayListByWhileLoop(arrayList);
    }

}
