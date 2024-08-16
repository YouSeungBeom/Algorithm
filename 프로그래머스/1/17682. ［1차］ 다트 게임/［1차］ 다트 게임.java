import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int round = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (Character.isDigit(ch)) {
                round++;
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[round] = 10;
                    i++;
                } 
                else {
                    scores[round] = ch - '0';
                }
            } 
            else if (ch == 'S')
                scores[round] = (int) Math.pow(scores[round], 1);
            else if (ch == 'D')
                scores[round] = (int) Math.pow(scores[round], 2);
            else if (ch == 'T')
                scores[round] = (int) Math.pow(scores[round], 3);
            else if (ch == '*') {
                scores[round] *= 2;
                if (round > 0) {
                    scores[round - 1] *= 2;
                }
            } 
            else if (ch == '#') {
                scores[round] *= -1;
            }
        }

        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}