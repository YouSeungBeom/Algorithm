class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String str = sb.toString();
        int answer = 0;
        int digit = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            answer += (str.charAt(i) - '0') * Math.pow(3, digit++);
        }
        
        return answer;
    }
}