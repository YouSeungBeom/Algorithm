class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] aver = new double[score.length];
        
        for(int i = 0; i < aver.length; i++) {
            aver[i] = (score[i][0] + score[i][1]) / 2.0;
            answer[i] = score.length;
        }
        
        for(int i = 0; i < aver.length; i++) {
            for(int j = 0; j < aver.length; j++) {
                if(i == j) continue;
                
                if(aver[i] >= aver[j]) {
                    answer[i]--;
                }
            }
        }
        return answer;
    }
}