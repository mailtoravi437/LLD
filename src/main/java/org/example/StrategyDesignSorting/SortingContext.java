package org.example.StrategyDesignSorting;

public class SortingContext {
    private SortingStrategy sortingStrategy;
    SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int arr[]){
        sortingStrategy.sort(arr);
    }
}
