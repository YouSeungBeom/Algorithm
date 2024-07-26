// 65 ~ 90      0 ~ 25      97 ~ 122    26 ~ 51
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                int idx = c - 65;
                answer[idx]++;
            }
            else {
                int idx = c - 71;
                answer[idx]++;
            }
        }
        return answer;
    }
}