//Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all 
//non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters 
//and numbers.Given a string s, return true if it is a palindrome, or false otherwise.

 class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len=0;
        for(int i=0; i<s.length(); i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0'&& s.charAt(i)<='9'){
            len++;
        }
      }
        char[] str = new char[len];
        int k=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0'&& s.charAt(i)<='9'){
                str[k++] = s.charAt(i); 
            }
        }

      int i = 0;
      int j = len-1;
      while(i<=j){
          if(str[i]!=str[j]){
              return false;
          }else{
              i++;j--;
          }
      }
      return true;
    }
}
