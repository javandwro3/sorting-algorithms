package pl.jwrabel.trainings.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class InsertionSort implements SortingAlgorithm {
    public int[] sort(int[] data) {
        List<Integer> list = new ArrayList<>();

//        PĘTLA FOR-EACH
//        for (int elem : data) {
//            // KOD
//        }
//        // TO TO SAMO CO
//        for (int i = 0; i < data.length; i++) {
//            int elem = data[i];
//            // KOD
//        }

//      wstawienie wartości 10 do listy pod indeksem 3
//      list.add(3, 10);

        for (int toInsert : data) {

            boolean found = false;

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) > toInsert){
                    list.add(i, toInsert);
                    found = true;
                    break;
                }
            }

            if(!found){
                list.add(toInsert);
            }

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
