class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        for(int i : lottos) {
            if(i == 0) {
                zero++;
                continue;
            }
            for(int j : win_nums) {
                if(i == j) {
                    count++;
                }
            }
        }
        switch(count) {
            case 6 :
                answer[1] = 1;
                break;
            case 5 :
                answer[1] = 2;
                break;
            case 4 :
                answer[1] = 3;
                break;
            case 3 :
                answer[1] = 4;
                break;
            case 2 :
                answer[1] = 5;
                break;
            default :
                answer[1] = 6;
                break;
        }
        answer[0] = (answer[1] - zero) == 0 ? 1 : answer[1] - zero;
        return answer;
    }
}