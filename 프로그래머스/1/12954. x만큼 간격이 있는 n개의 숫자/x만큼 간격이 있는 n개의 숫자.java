import java.util.List;
import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> nums = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            nums.add((long) x * i);
        }
        
        long[] answer = new long[nums.size()];
        for(int i = 0; i < nums.size(); i++) {
            answer[i] = (long) nums.get(i);
        }
        
        return answer;
    }
}