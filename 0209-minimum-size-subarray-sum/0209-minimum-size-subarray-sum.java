class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int end = 0; end < nums.length; end++){
            currSum += nums[end];
            while(currSum >= target){
                int currLen = end - start + 1;
                minLen = Math.min(minLen,currLen);
                currSum -= nums[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}