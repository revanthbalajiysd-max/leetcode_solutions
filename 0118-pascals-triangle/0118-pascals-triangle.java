import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.set(j, val);
            }

            triangle.add(row);
        }

        return triangle;
    }
}