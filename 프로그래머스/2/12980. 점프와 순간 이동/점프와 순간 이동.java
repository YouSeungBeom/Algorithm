import java.util.*;

public class Solution {
    public int solution(int N) {
        int ans = 1;
        while(N != 1) {
            if(N % 2 == 0) {
                N = N / 2;
            } else {
                N = N - 1;
                ans++;
            }
        }
        return ans;
    }
}