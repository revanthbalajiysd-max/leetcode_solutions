class Solution {
    public int divide(int dividend, int divisor) {
        // Step 1: Handle special case - INT_MIN / -1 = overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Step 2: Work with positive numbers only (easier)
        boolean negative = (dividend < 0) != (divisor < 0);
        long a = Math.abs((long)dividend);  // Use long to avoid overflow
        long b = Math.abs((long)divisor);
        long result = 0;
        
        // Step 3: Core logic - subtract multiples using bit shifting
        while (a >= b) {
            long temp = b;
            long count = 1;
            
            // Double the divisor (like 2x, 4x, 8x...) until too big
            while (a >= (temp << 1)) {
                temp <<= 1;  // temp = temp * 2
                count <<= 1; // count = count * 2
            }
            
            a -= temp;     // Subtract the largest possible multiple
            result += count;
        }
        
        // Step 4: Apply sign and return
        return negative ? (int)-result : (int)result;
    }
}