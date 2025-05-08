class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = timelogs.length;
        
        for(int i = 0; i < timelogs.length; i++) {
            int today = startday;
            int limit =  schedules[i] % 100 >= 50 ? schedules[i] + 50 : schedules[i] + 10;
            
            for(int j = 0; j < 7; j++) {
                //System.out.println("직원 : " + i + "\n" +
                //                   "요일 : " + today % 7 + "\n" +
                //                   "제한시간 : " + limit + "\n" +
                //                   "출근시간 : " + timelogs[i][j] + "\n");
                if(today % 7 == 6 || today % 7 == 0) {
                    today++;
                    continue;
                }
                
                if(limit < timelogs[i][j]) {
                    answer--;
                    break;
                }
                today++;
            }
        }
        return answer;
    }
}