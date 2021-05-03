package april_2021.practice1;

public class Task9 {

    private static void getFibonacci(int num) {
        int x = 0, y = 0, n = 1;
        for (int i = 0; i < num; i++) {
            x = y;
            y = n;
            n = x + y;
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        getFibonacci(5);
        System.out.println();
        getFibonacci(11);
    }

}
