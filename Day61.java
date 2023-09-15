//349. Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
         HashSet<Integer> resultSet=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                resultSet.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        //converting set in array
        // int[] resultArray=new int[resultSet.size()];
       int[] resultArray = resultSet.stream()
         .mapToInt(Integer::intValue)
          .toArray();

          return resultArray;


        
    }
}
