class Solution {
    public int characterReplacement(String s, int k) {
      int start = 0;
      int maxLen = 0;
      int maxFreq = 0;
      HashMap<Character,Integer> frequencyMap = new HashMap<>();
      for(int end = 0; end < s.length();end++){
        char ch = s.charAt(end);
        frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0) + 1);
        maxFreq = Math.max(maxFreq, frequencyMap.get(ch));
        while(end - start + 1 - maxFreq > k) {
           char outgoing = s.charAt(start);
           frequencyMap.put(outgoing, frequencyMap.getOrDefault(outgoing, 0) - 1);
           start++;
        }
        maxLen = Math.max(maxLen,end - start + 1);
      }
      return maxLen;
    }
}