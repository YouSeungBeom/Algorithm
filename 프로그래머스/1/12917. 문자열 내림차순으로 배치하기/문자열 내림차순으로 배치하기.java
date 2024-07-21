import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] s_arr = s.split("");
        Arrays.sort(s_arr, Collections.reverseOrder());
        StringBuilder answer = new StringBuilder();
        for(String a : s_arr) {
            answer.append(a);
        }
        return answer.toString();
    }
}