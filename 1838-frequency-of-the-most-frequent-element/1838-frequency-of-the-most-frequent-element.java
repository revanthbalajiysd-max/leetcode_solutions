class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (nums[right] * (right - left + 1L) - sum > k) {
                sum -= nums[left];   
                left++;
            }
            int windowSize = right - left + 1;
            maxFreq = Math.max(maxFreq, windowSize);
        }

        return maxFreq;
    }

}