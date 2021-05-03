//Напишите программу на Java, чтобы поменять местами значения, хранящиеся в двух переменных, без использования третьей переменной.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input values: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Values before change. a: " + a + ", b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after change. a: " + a + ", b: " + b);
    }

}
