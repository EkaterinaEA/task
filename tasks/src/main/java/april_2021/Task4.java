package april_2021;

public class Task4 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int temp = a + b;
        a = temp - a;
        b = temp - b;
        System.out.println(a);
        System.out.println(b);
    }

}
