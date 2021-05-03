package train1;// Напишите Java-программу, чтобы найти второе по величине число в массиве.

public class Task12 {

    public static void main(String[] args) {
        int[] array = {10, 11, 12, 56, 7, 24, 45, 65556};
        int biggest = array[0];
        int secondBiggest = array[0];
        System.out.println("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                secondBiggest = biggest;
                biggest = array[i];
            } else {
                if (array[i] > secondBiggest && array[i] != biggest) {
                    secondBiggest = array[i];
                }
            }
        }
        System.out.println("\nsecondBiggest:" + secondBiggest);
    }
}
