class Solution {
    public int myAtoi(String s) {
        long num = 0;
        boolean negative = false;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i < s.length() && s.charAt(i) == '-') {
            negative = true;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            long max = negative ? -(long) Integer.MIN_VALUE : (long) Integer.MAX_VALUE;
            if (num > max / 10 || (num == max / 10 && digit > max % 10)) {
                if (negative) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
            num = num * 10 + digit;
            i++;
        }
        if (negative) {
            num = -num;
        }
        return (int) num;
    }
}