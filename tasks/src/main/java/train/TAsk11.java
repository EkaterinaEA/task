package train;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class TAsk11 {

    public static void main(String[] args) {
        String string = "irjtoi kdjfv rhbg11222";
        String[] array = string.split("");
        Arrays.stream(array).collect(Collectors.groupingBy(c -> Collectors.counting()));
        System.out.println(Arrays.toString(array));

        HashMap<String, Integer> map = new HashMap<>();

    }

}
