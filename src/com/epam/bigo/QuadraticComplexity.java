package com.epam.bigo;

public class QuadraticComplexity {

  // Function with quadratic time complexity O(n^2)
  // In this example, the printAllPairs function has a nested loop.
  // For each element at index i, it iterates through all elements again with the second loop at index j.
  // This results in a total of n * n iterations, where n is the length of the array.
  // Therefore, the time complexity of this function is quadratic (O(n^2)).

  public static void printAllPairs(int[] arr) {
    // Record the start time
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
      }
    }

    // Record the end time
    long endTime = System.currentTimeMillis();

    // Calculate and print the elapsed time
    long elapsedTime = endTime - startTime;
    System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
  }

  public static void main(String[] args) {
    // Elapsed Time: 5 milliseconds on my computer
    printAllPairs(createIntArray(10));

    // Elapsed Time: 68 milliseconds on my computer
    printAllPairs(createIntArray(100));
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
