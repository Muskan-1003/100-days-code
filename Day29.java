//442. Find All Duplicates in an Array
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//You must write an algorithm that runs in O(n) time and uses only constant extra space.


class Solution {
  public int findDuplicates (int[] arr) {
        int i=0;
        while (i< arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
            return -1;
    }
    private static void swap(int[] arr, int first ,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

 
