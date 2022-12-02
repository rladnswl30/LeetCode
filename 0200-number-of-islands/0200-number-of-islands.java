class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && visit[i][j] == false) {
                    count++;
                    visitAll(grid, visit, i, j);
                }
            }
        }

        return count;
    }

    private static void visitAll(char[][] grid, boolean[][] visit, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visit[i][j] == true) {
            return;
        }

        visit[i][j] = true;
        
        
        if (grid[i][j] == '0') {
            return;
        }

        visitAll(grid, visit, i - 1, j);
        visitAll(grid, visit, i + 1, j);
        visitAll(grid, visit, i, j - 1);
        visitAll(grid, visit, i, j + 1);
    }
}