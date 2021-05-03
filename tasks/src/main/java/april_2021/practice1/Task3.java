package april_2021.practice1;

public class Task3 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println("before a: " + a);
        System.out.println("before b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after a: " + a);
        System.out.println("after b: " + b);
    }

}
