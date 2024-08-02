import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        if(score.length < m)    return 0;
        
        Arrays.sort(score);
        
        int answer = 0;
        
        for(int i = score.length % m; i < score.length; i += m) {
            answer += score[i];
        }
        return answer * m;
    }
}