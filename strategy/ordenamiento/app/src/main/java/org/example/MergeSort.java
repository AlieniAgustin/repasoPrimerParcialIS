package org.example;

import java.util.List;
import java.util.ArrayList;

public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;

            List<Integer> left = new ArrayList<>(list.subList(0, mid));
            List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

            sort(left);
            sort(right);

            merge(left, right, list);
        }
    }

    private void merge(List<Integer> left, List<Integer> right, List<Integer> list) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
    }
}
