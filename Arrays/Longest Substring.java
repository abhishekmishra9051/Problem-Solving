
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.


class Solution {
    // Method to find the length of the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
      // Create a map to store characters and their indices
      HashMap<Character, Integer> map = new HashMap<>();
      // Initialize indices for the substring
      int left = 0;
      int right = 0;
      // Get the length of the string
      int n = s.length();
      // Initialize the length of the longest substring
      int len = 0;
      
      // Loop until the end of the string is reached
      while(right < n){
          // Check if the character at the current index has been seen before
          if(map.containsKey(s.charAt(right))){
              // Update the left index to the maximum of the current left index
              // and the index of the character in the map plus 1
              left = Math.max(map.get(s.charAt(right))+1, left);
          }
          // Add the character and its index to the map
          map.put(s.charAt(right), right);
          // Update the length of the longest substring to the maximum of its current value
          // and the length of the current substring
          len = Math.max(len, right-left+1);
          // Move the right index to the next character
          right++;
      }  
      // Return the length of the longest substring
      return len;
    }
}
