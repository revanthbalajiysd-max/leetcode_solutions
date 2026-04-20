import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (lastSeen.containsKey(num) && i - lastSeen.get(num) <= k) {
                return true;
            }
            lastSeen.put(num, i);
        }

        return false;
    }
}