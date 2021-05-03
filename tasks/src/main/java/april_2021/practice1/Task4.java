package april_2021.practice1;

public class Task4 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println("before a: " + a);
        System.out.println("before b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after a: " + a);
        System.out.println("after b: " + b);
    }

}
