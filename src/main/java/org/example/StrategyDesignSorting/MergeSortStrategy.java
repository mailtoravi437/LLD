package org.example.StrategyDesignSorting;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Sort using merge sort strategy");
    }
}
