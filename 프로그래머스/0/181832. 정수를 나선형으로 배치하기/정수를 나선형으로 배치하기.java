class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int x = 0, y = 0;
        int num = 1;
        
        for (int i = 0; i < n * n; i++) {
            answer[x][y] = num++;
            
            int nextX = x + directions[dir][0];
            int nextY = y + directions[dir][1];
            
            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || answer[nextX][nextY] != 0) {
                dir = (dir + 1) % 4;
                nextX = x + directions[dir][0];
                nextY = y + directions[dir][1];
            }
            
            x = nextX;
            y = nextY;
        }
        
        return answer;
    }
}