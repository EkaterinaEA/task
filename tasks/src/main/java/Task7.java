// простое число или нет

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (isPrime(x)) {
            System.out.println("x = " + x + " is prime");
        } else {
            System.out.println("x = " + x + " doesn't prime");
        }
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
}
