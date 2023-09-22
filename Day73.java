//Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) >= start) {
                maxLength = Math.max(maxLength, i - start);
                start = charMap.get(s.charAt(i)) + 1;
            }
            charMap.put(s.charAt(i), i);
        }

        return Math.max(maxLength, s.length() - start);
    }

    
        
}
