package pl.jwrabel.trainings.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class InsertionSort implements SortingAlgorithm {
    public int[] sort(int[] data) {
        List<Integer> list = new ArrayList<>();

//        for (int elem : data) {
//            // KOD
//        }
//        // TO TO SAMO CO
//        for (int i = 0; i < data.length; i++) {
//            int elem = data[i];
//
//            // KOD
//
//        }

        for (int elem : data) {

            // wstawianie do listy
            // w poprawnej kolejności

        }

        for (int i = 0; i < data.length; i++) {
            data[i] = list.get(i);
        }
        return data;
    }

    @Override
    public String toString() {
        return "Insertion sort";
    }
}
