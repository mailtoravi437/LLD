package org.example.StrategyDesignSorting;

public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using QuickSortStrategy");
    }
}
