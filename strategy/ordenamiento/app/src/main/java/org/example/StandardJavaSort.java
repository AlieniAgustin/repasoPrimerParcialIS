package org.example;

import java.util.List;
import java.util.Collections;

public class StandardJavaSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> list) {
        Collections.sort(list);    
    }
}
