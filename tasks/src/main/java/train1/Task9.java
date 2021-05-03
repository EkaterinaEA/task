package train1;//Написать программу на Java для вычисления серии чисел Фибоначчи.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 1;
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i <= length; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.print(x + " ");
        }
    }
}
