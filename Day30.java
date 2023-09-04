//645. Set Mismatch
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, 
//due to some error, one of the numbers in s got duplicated to
//another number in the set, which results in repetition of one number and loss of another number.

class Solution {
    public int[] findErrorNums(int[] nums) {
    int i = 0;
    
    while (i < nums.length) {
        int correct = nums[i] - 1;
        
        if (nums[i] != nums[correct]) {
            swap(nums, i, correct);
        } else {
            i++;
        }
    }
    
    for (int index = 0; index < nums.length; index++) {
        if (nums[index] != index + 1) {
            return new int[]{nums[index], index + 1};
        }
    }
    
    
    return new int[]{-1, -1};
}

private static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
}
