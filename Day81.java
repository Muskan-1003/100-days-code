//Reverse Words in a String III
class Solution {
    public String reverseWords(String s) {
        int start = 0, end = 0;
        char[] charArray = s.toCharArray();
        while (start < s.length()) {
            while (end < s.length() && charArray[end] != ' ') {
                end++;
            }
            reverse(charArray, start, end - 1);
            start = end + 1;
            end = start;
        }
        return new String(charArray);
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
