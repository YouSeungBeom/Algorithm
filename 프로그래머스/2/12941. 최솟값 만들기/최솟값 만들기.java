import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        int len = A.length;
        Integer[] IB = new Integer[len];
        
        for(int i = 0; i < len; i++) {
            IB[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(IB, Collections.reverseOrder());
        
        for(int i = 0; i < len; i++) {
            answer += A[i] * IB[i];
        }
        return answer;
    }
}