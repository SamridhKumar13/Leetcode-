class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        char[][] mat = new char[m][n];

        // Initialize all cells as obstacles
        for (int i = 0; i < m; i++) {
            Arrays.fill(mat[i], '#');
        }

        // Make the first row free
        for (int j = 0; j < n; j++) {
            mat[0][j] = '.';
        }

        // Make the last column free
        for (int i = 1; i < m; i++) {
            mat[i][n - 1] = '.';
        }

        // Convert each row into a String
        for (int i = 0; i < m; i++) {
            grid[i] = new String(mat[i]);
        }

        return grid;
    }
}