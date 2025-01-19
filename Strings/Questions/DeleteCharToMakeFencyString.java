/*
L.C:  1957. Delete Characters to Make Fancy String

A fancy string is a string where no three consecutive characters are equal.
Given a string s, delete the minimum possible number of characters from s to make it fancy.
Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:
Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".

Example 2:
Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".

Example 3:
Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".
 
Constraints:
1 <= s.length <= 105
s consists only of lowercase English letters.
*/
public class DeleteCharToMakeFencyString{
    public static String makeFancyString(String s){
        int n = s.length();
        char ch = s.charAt(0);
        int freq = 1;
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for(int i = 1;i<n;i++){
            if(s.charAt(i) == ch){
                freq++;
            }
            else{
                ch = s.charAt(i);
                freq = 1;
            }
            if(freq < 3){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        String s = "Navneeet Singh";
        String ans = makeFancyString(s);
        System.out.println(ans);
    }
}