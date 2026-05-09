class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            if (dfs(board, word, i, j, 0))
                return true;
    return false;
}

private boolean dfs(char[][] board, String word, int i, int j, int s) {
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
        return false;
    if (board[i][j] != word.charAt(s))
        return false;
    if (s == word.length() - 1)
        return true;

    char temp = board[i][j];
    board[i][j] = '*';  // mark as visited

    boolean found = dfs(board, word, i+1, j, s+1) ||
                    dfs(board, word, i-1, j, s+1) ||
                    dfs(board, word, i, j+1, s+1) ||
                    dfs(board, word, i, j-1, s+1);

    board[i][j] = temp;  // backtrack
    return found;
    }
}