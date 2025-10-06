package org.example;

import java.util.List;
import java.util.ArrayList;

public class App {
  
  private List<Integer> nums;
  private SortingAlgorithm sortingAlgorithm;

  public App(List<Integer> nums, SortingAlgorithm sortingAlgorithm){
    this.nums = nums;
    this.sortingAlgorithm = sortingAlgorithm;
  }

  public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm){
    this.sortingAlgorithm = sortingAlgorithm;
  }

  public List<Integer> getSortedNumbers(){
    List<Integer> sortedNumbers = new ArrayList<>(nums);
    sortingAlgorithm.sort(sortedNumbers);
    return sortedNumbers;
  }

}
