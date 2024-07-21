class Solution {
    public int[] solution(int n, int m) {
        int gcd =  m;
        int a = n;
        
        while(a != 0) {
            int r = gcd % a;
            gcd = a;
            a = r;
        }
        
        int lcm = n * m / gcd;
        
        int[] answer = {gcd, lcm};
        return answer;
    }
}

