class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int currSum = 0;
        int count = 0;
        for(int end = 0; end < arr.length; end++){
            currSum += arr[end];
            if(end - start + 1 == k){
                int avg = currSum / k;
                if(avg >= threshold){
                    count++;
                }
                currSum -= arr[start];
                start ++;
            }
        }
        return count;
    }
}