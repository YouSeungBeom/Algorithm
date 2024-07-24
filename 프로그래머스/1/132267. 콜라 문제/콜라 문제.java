class Solution {
    public int solution(int a, int b, int n) {
        int answer = b * (n / a);
        int cola = n % a + b * (n / a);
        while(cola >= a) {
            answer += b * (cola / a);
            cola = cola % a + b * (cola / a);
        }
        return answer;
    }
}