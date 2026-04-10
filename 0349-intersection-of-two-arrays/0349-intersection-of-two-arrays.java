class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];   // 0 <= nums[i] <= 1000
        boolean[] inResult = new boolean[1001];
        int count = 0;

        // Mark all numbers that appear in nums1
        for (int x : nums1) {
            seen[x] = true;
        }

        // Check nums2: if present in nums1 and not already added
        for (int x : nums2) {
            if (seen[x] && !inResult[x]) {
                inResult[x] = true;
                count++;
            }
        }

        // Build the result array
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < 1001; i++) {
            if (inResult[i]) {
                result[index++] = i;
            }
        }

        return result;
    }
}