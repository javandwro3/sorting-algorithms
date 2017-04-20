package pl.jwrabel.trainings.algorithms.sorting;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class SelectionSort implements SortingAlgorithm {
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int indexOfMin = findIndexOfMin(data, i);

            int tmp = data[i];
            data[i] = data[indexOfMin];
            data[indexOfMin] = tmp;
        }
        
        return data;
    }

    int findIndexOfMin(int[] data, int fromIndex) {
        int minIndex = fromIndex;

        for (int i = fromIndex + 1; i < data.length; i++) {
            if (data[i] < data[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    int findMin(int[] data) {
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        return min;
    }

    @Override
    public String toString() {
        return "Selection sort";
    }
}
