package train1;//Напишите программу на Java для того, чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Please input values:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Values before change. a: " + a + ", b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Values after change. a: " + a + ", b: " + b);
    }

}
