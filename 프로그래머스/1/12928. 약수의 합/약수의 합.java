class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n == Math.pow(i, 2)) {
                    answer += i;
                    break;
                }
                answer += i + n/i;
            }
        }
        return answer;
    }
}