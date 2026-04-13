class Solution {
    public boolean isPowerOfTwo(int n) {
      return n > 0 && (n & (n-1)) == 0;
    }
}
/*
1 = 0b1

2 = 0b10

4 = 0b100

8 = 0b1000, etc. */