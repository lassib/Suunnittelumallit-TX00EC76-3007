package strategy;

public class BubbleSort implements ISortStrategy {

    @Override
    public int[] sort(int[] array) {
        long startTime = System.nanoTime();

        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("BubbleSort: " + duration + " nanoseconds");
        return array;
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

