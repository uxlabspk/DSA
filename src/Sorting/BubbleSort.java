package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        // Usually this algorithm takes n(n - 1)/2 iterations
        // so, in our case it should take 28 iterations
        int[] numbers = new int[] {43, 23, 99, 32, 11, 21, 10, 89};

        int iterations = 0;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                iterations++;
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }


        System.out.println("\nTotal iterations are " + iterations);
    }
}
