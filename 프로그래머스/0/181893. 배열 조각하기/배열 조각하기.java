import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        
        for (int i = 0; i < query.length; i++) {
            List<Integer> list = new ArrayList<>();
            
            if (i % 2 == 0) {
                for (int j = 0; j <= query[i]; j++) {
                    list.add(answer[j]);
                }
            } 
            else {
                for (int j = query[i]; j < answer.length; j++) {
                    list.add(answer[j]);
                }
            }
            answer = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                answer[j] = list.get(j);
            }
        }
        return answer;
    }
}