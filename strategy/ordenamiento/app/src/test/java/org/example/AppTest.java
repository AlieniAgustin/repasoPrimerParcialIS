package org.example;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  public void testBubbleSort(){
    List<Integer> nums = new ArrayList<>();
    nums.add(3);
    nums.add(2);
    nums.add(4);
    nums.add(4);
    nums.add(1);

    App app = new App(nums,new BubbleSort());
    List<Integer> sortedNums = app.getSortedNumbers();
    assertEquals("[1, 2, 3, 4, 4]", sortedNums.toString());
  }

  @Test
  public void testMergeSort(){
    List<Integer> nums = new ArrayList<>();
    nums.add(3);
    nums.add(2);
    nums.add(4);
    nums.add(4);
    nums.add(1);

    App app = new App(nums,new MergeSort());
    List<Integer> sortedNums = app.getSortedNumbers();
    assertEquals("[1, 2, 3, 4, 4]", sortedNums.toString());
  }

  @Test
  public void testStandardJavaSort(){
    List<Integer> nums = new ArrayList<>();
    nums.add(3);
    nums.add(2);
    nums.add(4);
    nums.add(4);
    nums.add(1);

    App app = new App(nums,new StandardJavaSort());
    List<Integer> sortedNums = app.getSortedNumbers();
    assertEquals("[1, 2, 3, 4, 4]", sortedNums.toString());
  }

}
