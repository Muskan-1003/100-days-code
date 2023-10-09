//Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int[] res = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                res[0]=mid;//potential value
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
         start = 0;
        end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                res[1]=mid;//potential value
                start=mid+1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return res;



    }
}

        
