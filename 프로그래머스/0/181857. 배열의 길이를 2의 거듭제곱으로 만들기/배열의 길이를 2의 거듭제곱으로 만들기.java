import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        for(int i = 0; i <= 10; i++) {
            if(arr.length <= Math.pow(2, i)) {
                answer = Arrays.copyOfRange(arr, 0, (int)Math.pow(2, i));
                break;
            }
        }
        return answer;
    }
}