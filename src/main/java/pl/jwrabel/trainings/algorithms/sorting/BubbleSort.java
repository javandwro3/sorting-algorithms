package pl.jwrabel.trainings.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class BubbleSort implements SortingAlgorithm {
    public int[] sort(int[] data) {
        Arrays.sort(data);
        return data;
    }

    @Override
    public String toString() {
        return "Bubble sort";
    }
}
