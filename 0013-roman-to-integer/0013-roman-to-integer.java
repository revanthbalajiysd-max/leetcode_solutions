class Solution {
    public int romanToInt(String s) {
        // Fast lookup array for Roman characters (based on ASCII)
        int[] val = new int[128];
        val['I'] = 1;
        val['V'] = 5;
        val['X'] = 10;
        val['L'] = 50;
        val['C'] = 100;
        val['D'] = 500;
        val['M'] = 1000;

        int n = s.length();
        int result = val[s.charAt(n - 1)]; // last char is always added

        for (int i = 0; i < n - 1; i++) {
            int curr = val[s.charAt(i)];
            int next = val[s.charAt(i + 1)];
            result += (curr < next) ? -curr : curr;
        }

        return result;
    }
}