package strategy;

public class InsertionSort implements ISortStrategy {

    @Override
    public int[] sort(int[] arr) {
        long startTime = System.nanoTime();

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("InsertionSort: " + duration + " nanoseconds");
        return arr;
    }
}
