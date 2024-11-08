import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String s = Integer.toString(i);
            if(!(s.contains("5") || s.contains("0"))) {
                continue;
            }
            s = s.replaceAll("5", "");
            s = s.replaceAll("0", "");
            if(s.length() == 0)
                list.add(i);
        }
        if(list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        else {
            int[] answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}