import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> k_num = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            
            int[] arr = Arrays.copyOfRange(array, start, end);
            Arrays.sort(arr);
            k_num.add(arr[k]);
        }
        
        int[] answer = new int[k_num.size()];
        for(int i = 0; i < k_num.size(); i++) {
            answer[i] = k_num.get(i);
        }
        
        return answer;
    }
}