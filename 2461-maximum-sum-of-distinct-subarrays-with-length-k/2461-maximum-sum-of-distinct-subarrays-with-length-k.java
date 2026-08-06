class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = Long.MIN_VALUE;
        int start = 0;
        long currentSum = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int end = 0; end < nums.length; end++){
            currentSum += nums[end];
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end],0) + 1);
            if(end - start + 1 == k){
               if(freqMap.size()== k){
                maxSum = Math.max(maxSum, currentSum);
               } 
               currentSum -= nums[start];
               freqMap.put(nums[start], freqMap.get(nums[start])-1);
               if(freqMap.get(nums[start]) == 0){
                freqMap.remove(nums[start]);
               }
               start++;
            }
        }
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}