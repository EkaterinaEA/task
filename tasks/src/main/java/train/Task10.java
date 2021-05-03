package train;

import java.util.ArrayList;
import java.util.Iterator;

public class Task10 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
