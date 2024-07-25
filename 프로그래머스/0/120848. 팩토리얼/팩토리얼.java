class Solution {
    public int solution(int n) {
        int fac = 10;
        int N = 3628800;
        
        while (fac > 1) {
            if (n >= N) {
                break;
            }
            N /= fac;
            fac--;
        }
        return fac;
    }
}