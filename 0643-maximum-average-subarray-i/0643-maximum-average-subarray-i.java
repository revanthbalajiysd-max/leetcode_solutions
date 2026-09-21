class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int end = 0; end < nums.length; end++){
            currentSum += nums[end];
            if(end - start + 1 == k){
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= nums[start];
                start++;
            }
        }
        double avg = (double) maxSum / k;
        return avg;
    }
}
/* why we use sliding window we use is s=contiguous subarry after finding it we find max avg value.*/