import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

/**
Given a string s, find the length of the longest 
substring without repeating characters.
 
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "pwwkew"; 
        String s3 = "au"; 
        String s4 = "dvdf";
        String s5 = " ";
        String s6 = "bpfbhmipx";
        int longestString = lengthOfLongestSubstring(s6);
        System.out.println(longestString);
    }
    public static int lengthOfLongestSubstring(String s) {
        int stringLen = 0;
        String chars = new String();
    
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if(chars.contains(String.valueOf(c))) {
                String newChars = new String();
                for (int i=chars.length() - 1; i >=0; i--) {
                    char pchar = chars.charAt(i);
                    if(pchar != c) {
                        newChars = String.valueOf(pchar) + newChars;
                    } else {
                        chars = newChars;
                        break;
                    }
                }
                chars = chars + String.valueOf(c);
            } else {
                chars = chars + String.valueOf(c);
            }
            if(stringLen < chars.length()) {
                stringLen = chars.length();
            }
        }
        return stringLen;
    }
}
