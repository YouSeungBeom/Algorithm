import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        int[][] keypad = {{1, 2, 3},
                          {4, 5, 6}, 
                          {7, 8, 9}, 
                          {-1, 0, -2}};
        
        Map<Integer, int[]> keyCoords = new HashMap<>();
        
        for(int i = 0; i < keypad.length; i++) {
            for(int j = 0; j < keypad[i].length; j++) {
                keyCoords.put(keypad[i][j], new int[]{i, j});
            }
        }
        
        int[] leftPos = keyCoords.get(-1);
        int[] rightPos = keyCoords.get(-2);
        
        for(int num : numbers) {
            int[] nextPos = keyCoords.get(num);
            
            if(num == 1 || num == 4 || num == 7) {
                leftPos = nextPos;
                answer.append("L");
            }
            else if(num == 3 || num == 6 || num == 9) {
                rightPos = nextPos;
                answer.append("R");
            }
            else {
                int leftLen = Math.abs(leftPos[0] - nextPos[0]) + Math.abs(leftPos[1] - nextPos[1]);
                int rightLen = Math.abs(rightPos[0] - nextPos[0]) + Math.abs(rightPos[1] - nextPos[1]);
                
                if(leftLen < rightLen) {
                    leftPos = nextPos;
                    answer.append("L");
                }
                else if(leftLen > rightLen) {
                    rightPos = nextPos;
                    answer.append("R");
                }
                else {
                    if(hand.equals("left")) {
                        leftPos = nextPos;
                        answer.append("L");
                    }
                    else {
                        rightPos = nextPos;
                        answer.append("R");
                    }
                }
            }
        }
        
        return answer.toString();
    }
}