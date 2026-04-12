class Solution {
    public int thirdMax(int[] nums) {
        long firstMax  = Long.MIN_VALUE;   // largest
        long secondMax = Long.MIN_VALUE;   // second largest
        long thirdMax  = Long.MIN_VALUE;   // third largest

        for (int num : nums) {
            // Skip duplicates
            if (num == firstMax || num == secondMax || num == thirdMax) {
                continue;
            }

            if (num > firstMax) {
                thirdMax  = secondMax;
                secondMax = firstMax;
                firstMax  = num;
            } else if (num > secondMax) {
                thirdMax  = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        // If third distinct max exists, return it; else return firstMax
        return (int) (thirdMax != Long.MIN_VALUE ? thirdMax : firstMax);
    }
}