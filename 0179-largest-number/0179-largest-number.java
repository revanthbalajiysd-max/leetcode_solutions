class Solution {
    public String largestNumber(int[] nums) {

    String[] strs = Arrays.stream(nums)
                          .mapToObj(String::valueOf)
                          .toArray(String[]::new);
    Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

    StringBuilder sb = new StringBuilder();
    for (String s : strs) sb.append(s);

    String result = sb.toString();
    return result.startsWith("0") ? "0" : result; 
    }
}