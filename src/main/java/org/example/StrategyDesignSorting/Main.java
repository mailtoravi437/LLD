package org.example.StrategyDesignSorting;

public class Main {
    public static void main(String[] args){
        SortingContext sorter = new SortingContext(new BubbleSortStrategy());
        int arr1[] = {1,2,3,4};
        sorter.performSort(arr1);
    }
}
