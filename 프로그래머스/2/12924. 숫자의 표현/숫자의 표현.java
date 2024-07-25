class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i >= 1; i--) {
            int num = n;
            for(int j = i; j >= 1; j--) {
                num -= j;
                
                if(num == 0) {
                    answer++;
                    break;
                } else if(num < 0) {
                    break;
                }
            }
        }
        return answer;
    }
}