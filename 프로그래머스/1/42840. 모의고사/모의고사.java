import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < 3; j++) {
                if(patterns[j][i % patterns[j].length] == answers[i]){
                    score[j]++;
                }
            }
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++) {
            if(max == score[i]) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}