import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        int count = 0;
        
        for (String s : str) {
            if (!s.isEmpty()) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int idx = 0;
        
        for (String s : str) {
            if (!s.isEmpty()) {
                answer[idx++] = s;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}