import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        Arrays.sort(indices);
        for(int i = 0; i < my_string.length(); i++) {
            if(indices[idx] == i) {
                if(idx + 1 < indices.length) {
                    idx++;
                }
                continue;
            }
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}