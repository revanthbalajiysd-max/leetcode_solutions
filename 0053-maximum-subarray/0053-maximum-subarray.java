class Solution {
    public int maxSubArray(int[] nums) {
    
        if(nums.length == 1){
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int num : nums){
            currSum = Math.max(currSum , 0);
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}