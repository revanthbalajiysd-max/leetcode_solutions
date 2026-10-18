class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int count = 0;
        int maxVowels = 0;
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            if(end - start + 1 == k){
                maxVowels = Math.max(maxVowels, count);
                if(maxVowels == k){
                    return k;
                }
                char c = s.charAt(start);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count--;
                }
                start++;
            }
        }
        return maxVowels;
    }
}