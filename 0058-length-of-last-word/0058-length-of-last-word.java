public class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        
        // Skip trailing spaces
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        
        int length = 0;
        // Count characters of the last word
        while (end >= 0 && s.charAt(end) != ' ') {
            length++;
            end--;
        }
        
        return length;
    }
}