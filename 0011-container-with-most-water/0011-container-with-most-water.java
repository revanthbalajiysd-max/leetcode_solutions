class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1; // using two pointers 
        int max = 0;
        while(left < right){
            int width = right - left; // the width or gap between the 2 containers
            int cur= Math.min(height[left], height[right]) * width;  
            max = Math.max(max, cur);
            if(height[left] < height[right]){
                left ++;
            } else{
                right--;
            }
        }
        return max;
    }
}