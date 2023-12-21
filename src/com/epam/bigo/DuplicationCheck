package com.epam.bigo;

public class DuplicationCheck {


  public static void main(String[] args) {
    int[] numbers = {3, 2, 1, 2, 4, 5, 1, 6, 6};
    findDuplicates(numbers);
  }

  // Quadratic complexity function to find duplicate elements
  private static void findDuplicates(int[] numbers) {
    int n = numbers.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (numbers[i] == numbers[j]) {
          System.out.println("Duplicate found: " + numbers[i]);
        }
      }
    }
  }
}
