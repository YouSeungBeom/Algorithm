import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n+1];
        
        for(int i = 2; i <= n; i++) {
            num[i] = i;
        }
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(num[i] == 0) continue;
            
            for(int j = i + i; j <= n; j = j + i) {
                num[j] = 0;
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if(num[i] != 0) answer ++;
        }
        
        return answer;
    }
}