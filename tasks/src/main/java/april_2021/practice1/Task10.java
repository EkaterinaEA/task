package april_2021.practice1;

import java.util.ArrayList;
import java.util.Iterator;

public class Task10 {

    private static void traverseArrayListUsingForLoop(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    private static void traverseArrayListUsingForEachLoop(ArrayList arrayList) {
        for (Object i : arrayList) {
            System.out.print(i + " ");
        }
    }

    private static void traverseArrayListUsingWhileLoop(ArrayList arrayList) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        traverseArrayListUsingForLoop(arrayList);
        System.out.println();
        traverseArrayListUsingForEachLoop(arrayList);
        System.out.println();
        traverseArrayListUsingWhileLoop(arrayList);
    }
}
