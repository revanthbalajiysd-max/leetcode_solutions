class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0, k = 0, m = 0;  
        while(i < word1.length && j < word2.length){
            if(word1[i].charAt(k) != word2[j].charAt(m)) return false; 
            k++;
            if(k == word1[i].length()){
                i++;
                k = 0;
            }
            m++; 
            if(m == word2[j].length()){ 
                j++;
                m = 0;
            }
        }
        return i == word1.length && j == word2.length;
    }
}