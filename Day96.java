//Single Element in a Sorted Array
//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid%2==1){//odd
              mid--;
            }
            if(nums[mid]!=nums[mid+1]){
                end=mid;
            }else{
                start=mid+2;
            }
        }return nums[end];
        
    }
}
