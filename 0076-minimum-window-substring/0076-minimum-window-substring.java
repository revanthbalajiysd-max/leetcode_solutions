class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0, minRight = 0;
        Map<Character, Integer> requiredMap = new HashMap<>();
        for(int i = 0 ; i < t.length(); i++){
            char ch = t.charAt(i);
            requiredMap.put(ch,requiredMap.getOrDefault(ch, 0)+ 1);
        }
        int formed = 0;
        int required = requiredMap.size();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int start = 0;
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            
            if(requiredMap.containsKey(ch) &&frequencyMap.get(ch).intValue() == requiredMap.get(ch).intValue()){
                formed++;
            }
            while(formed == required){
                int windowLength = end - start +1;
                if(windowLength < minLength){
                    minLength = windowLength;
                    minLeft = start;
                }
                char leftChar = s.charAt(start);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) -1);
                if(requiredMap.containsKey(leftChar) && frequencyMap.get(leftChar) < requiredMap.get(leftChar)){
                    formed--;
                }
                start++;
            }

        }
        if (minLength == Integer.MAX_VALUE) {
           return "";
        }
        return s.substring(minLeft, minLeft + minLength);
    }
}