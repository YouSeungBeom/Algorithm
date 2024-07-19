import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> nums = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                nums.add(i);
            }
        }
        
        int[] answer = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }
        
        return answer;
    }
}