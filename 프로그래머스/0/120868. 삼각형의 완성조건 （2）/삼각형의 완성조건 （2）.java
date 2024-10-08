import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        
        for(int i = 1; i <= sides[1]; i++) {
            if(sides[1] < sides[0] + i) {
                answer++;
            }
        }
        
        for(int i = sides[0] + sides[1] - 1; i > sides[1]; i--) {
            if(i < sides[0] + sides[1]) {
                answer++;
            }
        }
        
        return answer;
    }
}