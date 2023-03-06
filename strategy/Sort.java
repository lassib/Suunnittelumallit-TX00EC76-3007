package strategy;

public class Sort {
    private ISortStrategy sortStrategy;

    public Sort(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] arr) {
        return sortStrategy.sort(arr);
    }

    public void setSortStrategy(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

}
