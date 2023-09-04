// First Missing Positive
//Given an unsorted integer array nums, return the smallest missing positive integer.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

class Solution {
    public int firstMissingPositive(int[] arr) {
       
        int i=0;
        while(i < arr.length){

            int correct=arr[i] -1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //search for missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                return index+1;
            }

        }
        //case2
        return arr.length+1;

    }
    private static void swap(int[] arr, int first ,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
