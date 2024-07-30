class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int width = board[0] / 2;
        int height = board[1] / 2;
        int[] answer = new int[2];
        for(int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "right" :
                    if(answer[0] != width)
                        answer[0]++;
                    break;
                case "left" :
                    if(answer[0] != -width)
                        answer[0]--;
                    break;
                case "up" :
                    if(answer[1] != height)
                        answer[1]++;
                    break;
                case "down" :
                    if(answer[1] != -height)
                        answer[1]--;
                    break;
            }
        }
        return answer;
    }
}