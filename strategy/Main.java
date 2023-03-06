package strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Creates an array of 10000 random numbers
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9999) + 1;
        }

        Sort sort = new Sort(new BubbleSort());
        sort.sort(array.clone());

        sort.setSortStrategy(new InsertionSort());
        sort.sort(array.clone());

        sort.setSortStrategy(new SelectionSort());
        sort.sort(array.clone());

    }
}
