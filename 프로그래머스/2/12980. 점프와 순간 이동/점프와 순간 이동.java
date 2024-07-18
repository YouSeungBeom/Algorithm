/*
K칸 점프, 온 거리 * 2 순간이동
순간이동 -> 건전지 사용 안 함.
점프 -> K만큼 건전지 사용.
*/

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