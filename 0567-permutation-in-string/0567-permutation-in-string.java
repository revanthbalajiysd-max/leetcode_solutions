class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
       Map<Character, Integer> map1 = new HashMap<>();
       for(int i = 0; i < s1.length(); i++){
        char ch = s1.charAt(i);
        map1.put(ch, map1.getOrDefault(ch, 0) + 1);
       }
       Map<Character, Integer> map2 = new HashMap<>();
       int start = 0;
       for(int end = 0; end < s2.length(); end++){
        char ch = s2.charAt(end);
        map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        while(end - start + 1 == s1.length()){
            if(map1.equals(map2)){
                return true;
            }
            char outgoing = s2.charAt(start);
            int count = map2.get(outgoing)-1;
            if(count == 0){
                map2.remove(outgoing);
            } else {
                map2.put(outgoing, count);
            }
            start++;
        }
       }
       return false;
    }
}