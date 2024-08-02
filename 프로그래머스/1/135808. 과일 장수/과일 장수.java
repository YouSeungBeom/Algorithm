/*
2차원 배열 접근. [i][0] * i * m으로 answer 계산
for문 반복할 때, score길이 / m 크기 배열만든 후 하나씩 넣기
*/
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        if(score.length < m)    return 0;
        
        Arrays.sort(score);
        
        int answer = 0;
        int n = (int)score.length / m;
        int[][] apple_box = new int[n][m];
        int idx = score.length % m;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                apple_box[i][j] = score[idx++];
            }
        }
        
        for(int i = 0; i < n; i++) {
            answer += apple_box[i][0] * m;
        }
        
        return answer;
    }
}