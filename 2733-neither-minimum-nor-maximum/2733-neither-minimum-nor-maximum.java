class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n <= 2) return -1;
        int randomNum = nums[1];
        return randomNum;
    }
}