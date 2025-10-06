package org.example;

import java.util.List;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> list) {
        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1) > list.get(i)) {
                    int temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--; // mejora: reduce el rango tras cada pasada
        } while (swapped);
    }
}
