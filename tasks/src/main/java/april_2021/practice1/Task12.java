package april_2021.practice1;

public class Task12 {

    // Не работает!!!

    private static int getSecondBiggestNumberFromArray(int[] array) {
        int biggest = 0;
        int secondBiggest = 0;
        if (array[0] > array[1]) {
            biggest = array[0];
            secondBiggest = array[1];
        } else {
            biggest = array[1];
            secondBiggest = array[0];
        }
        for (int value : array) {
            if (value > biggest) {
                secondBiggest = biggest;
                biggest = value;
            } else if (value > secondBiggest && value != biggest) {
                secondBiggest = value;
            }
        }
        return secondBiggest;
    }

    public static void main(String[] args) {
        int[] array1 = {100000, 10000, 4, 56, 133, 0, 7}; // 10000
        int[] array2 = {1440, 51, 4, 586, 133, 0, 7};     // 586
        int[] array3 = {1440, 1440, 4, 586, 133, 0, 7};   // 586 // Здесь получаю 1440
        int[] array4 = {1440, 586, 4, 586, 133, 0, 7};    // 586

        System.out.println(getSecondBiggestNumberFromArray(array1));
        System.out.println(getSecondBiggestNumberFromArray(array2));
        System.out.println(getSecondBiggestNumberFromArray(array3));
        System.out.println(getSecondBiggestNumberFromArray(array4));
    }

}
