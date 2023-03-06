package strategy;

public class SelectionSort implements ISortStrategy {

    @Override
    public int[] sort(int[] arr) {
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("SelectionSort: " + duration + " nanoseconds");
        return arr;
    }
}
