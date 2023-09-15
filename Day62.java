
//2248. Intersection of Multiple Arrays

class Solution {
    public List<Integer> intersection(int[][] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        // Initialize a set with elements from the first array
        Set<Integer> commonElements = new HashSet<>();
        for (int num : nums[0]) {
            commonElements.add(num);
        }

        // Iterate through the rest of the arrays
        for (int i = 1; i < nums.length; i++) {
            Set<Integer> currentSet = new HashSet<>();
            for (int num : nums[i]) {
                if (commonElements.contains(num)) {
                    currentSet.add(num);
                }
            }
            commonElements = currentSet;
        }

        // Convert the set to a sorted list
        List<Integer> result = new ArrayList<>(commonElements);
        Collections.sort(result);

        return result;
    }
    }
