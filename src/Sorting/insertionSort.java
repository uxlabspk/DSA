package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] numbers = new int[] {43, 23, 99, 32, 11, 21, 10, 89};

        int count = 0;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                count++;
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                } else
                    break;
            }
        }

        for(int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Total counts are : " + count);

    }
}
