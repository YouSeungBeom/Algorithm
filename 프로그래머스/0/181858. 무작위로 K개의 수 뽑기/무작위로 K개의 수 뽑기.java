import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int num : arr) {
            set.add(num);
            if (set.size() == k) {
                break;
            }
        }
        
        int[] answer = new int[k];
        int i = 0;
        for (int num : set) {
            answer[i++] = num;
        }
        while (i < k) {
            answer[i++] = -1;
        }
        
        return answer;
    }
}