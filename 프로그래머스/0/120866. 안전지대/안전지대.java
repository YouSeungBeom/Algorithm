class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    arr[i][j] = 1;
                    
                    if (i - 1 >= 0) arr[i - 1][j] = 1;
                    if (i + 1 < n) arr[i + 1][j] = 1;
                    if (j - 1 >= 0) arr[i][j - 1] = 1;
                    if (j + 1 < n) arr[i][j + 1] = 1;
                    if (i - 1 >= 0 && j - 1 >= 0) arr[i - 1][j - 1] = 1;
                    if (i - 1 >= 0 && j + 1 < n) arr[i - 1][j + 1] = 1;
                    if (i + 1 < n && j - 1 >= 0) arr[i + 1][j - 1] = 1;
                    if (i + 1 < n && j + 1 < n) arr[i + 1][j + 1] = 1;
                }
            }
        }
        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}