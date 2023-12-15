package com.epam.bigo;


public class ConstantComplexity {

  // Constant Complexity O(1)
  // The time complexity of this operation is O(1) because it doesn't depend on the size of the array.
  // Whether the array has 1 element or 1000 elements, the time it takes to access the first element is constant.
  public static void printFirstElement(int[] array) {
    // Record the start time
    long startTime = System.currentTimeMillis();

    if (array.length > 0) {
      System.out.println("First element: " + array[0]);
    } else {
      System.out.println("Array is empty.");
    }

    // Record the end time
    long endTime = System.currentTimeMillis();

    // Calculate and print the elapsed time
    long elapsedTime = endTime - startTime;
    System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
  }

  public static void main(String[] args) {
    // Whether the array has 1 element or 1000 elements,
    // the time it takes execute printFirstElement() function is constant

    printFirstElement(createIntArray(1));
    printFirstElement(createIntArray(100));
  }


  // Util function to create and fill  array of specific size
  public static int[] createIntArray(int size) {
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = i + 1;
    }
    return array;
  }
}