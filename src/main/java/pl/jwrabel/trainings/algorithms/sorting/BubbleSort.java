package pl.jwrabel.trainings.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class BubbleSort implements SortingAlgorithm {
    public int[] sort(int[] data) {
        int counter = 0;
        while (counter < data.length) {

            // pojedyncze przejście
            for (int i = 0; i < data.length - 1; i++) {

                if (data[i] > data[i + 1]) {
                    // zamiana miejscami dwóch elementów
                    int tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                }

            }
            counter++;

        }

        return data;
    }

    @Override
    public String toString() {
        return "Bubble sort";
    }
}
