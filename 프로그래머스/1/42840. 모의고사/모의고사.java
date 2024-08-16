import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] arr = {{1, 2, 3}, {2, 1, 3}, {3, 2, 1}, {4, 3, 1}, {5, 2, 2}, {1, 4, 2}, {2, 2, 4}, {3, 5, 4}, {4, 2, 5}, {5, 1, 5}, {1, 2, 3}, {2, 3, 3}, {3, 2, 1}, {4, 4, 1}, {5, 2, 2}, {1, 5, 2}, {2, 2, 4}, {3, 1, 4}, {4, 2, 5}, {5, 3, 5}, {1, 2, 3}, {2, 4, 3}, {3, 2, 1}, {4, 5, 1}, {5, 2, 2}, {1, 1, 2}, {2, 2, 4}, {3, 3, 4}, {4, 2, 5}, {5, 4, 5}, {1, 2, 3}, {2, 5, 3}, {3, 2, 1}, {4, 1, 1}, {5, 2, 2}, {1, 3, 2}, {2, 2, 4}, {3, 4, 4}, {4, 2, 5}, {5, 5, 5}};
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < 3; j++) {
                if(arr[i % 40][j] == answers[i]){
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