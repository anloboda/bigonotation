package com.epam.bigo;

public class LinearComplexity {

  // Function with linear time complexity O(n)
  // When you have a loop that iterates through each element of an array or a collection,
  // and the number of iterations is directly proportional to the size of the input,
  // you often have a linear time complexity.
  public static void printArrayElements(int[] arr) {
    // Record the start time
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Element at index " + i + ": " + arr[i]);
    }

    // Record the end time
    long endTime = System.currentTimeMillis();

    // Calculate and print the elapsed time
    long elapsedTime = endTime - startTime;
    System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
  }


  public static void main(String[] args) {
    // On my computer elapsed time is 3 milliseconds
    printArrayElements(createIntArray(10));

    // And here we increase the number of elements and elapsed time is 17 milliseconds
    // The number of iterations of printArrayElements function is directly proportional to the size of input
    printArrayElements(createIntArray(1000));

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
