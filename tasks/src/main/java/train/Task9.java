package train;

public class Task9 {

    public static void countFibonacci(int num) {
        int x = 0, y = 0, n = 1;
        for (int i = 0; i <= num; i++) {
            x = y;
            y = n;
            n = x + y;
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        countFibonacci(5);
    }
}
