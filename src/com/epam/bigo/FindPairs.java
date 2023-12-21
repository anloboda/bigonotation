package com.epam.bigo;

import java.util.HashSet;

public class FindPairs {

// let's say you have an array of integers,
// and the task is to find pairs of elements whose sum is equal to a given target value.


  public static void findPairsQuadratic(int[] numbers, int targetSum) {
    int n = numbers.length;

    // we have nested loop here so it's quadratic complexity
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (numbers[i] + numbers[j] == targetSum) {
          System.out.println("Pair found: (" + numbers[i] + ", " + numbers[j] + ")");
        }
      }
    }
  }

  public static void findPairsLinear(int[] numbers, int targetSum) {
    HashSet<Integer> seenNumbers = new HashSet<>();

    // we have just one loop here so it's linear complexity
    for (int number : numbers) {
      int complement = targetSum - number;
      if (seenNumbers.contains(complement)) {
        System.out.println("Pair found: (" + complement + ", " + number + ")");
      }
      seenNumbers.add(number);
    }
  }


  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println("Find pairs linear:");
    findPairsLinear(numbers, 7);

    System.out.println("Find pairs quadratic:");
    findPairsQuadratic(numbers, 7);

  }
}
