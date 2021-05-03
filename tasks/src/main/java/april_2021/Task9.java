package april_2021;

public class Task9 {

    private static int getSeriesAndSumFibonacci(int num) {
        int x = 0, y = 0, n = 1, sum = 0;
        for (int i = 0; i <= num; i++) {
            x = y;
            y = n;
            n = x + y;
            sum = sum + n;
            System.out.print(n + " ");
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSeriesAndSumFibonacci(5));
        System.out.println(getSeriesAndSumFibonacci(10));
    }

}
