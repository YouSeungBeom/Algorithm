import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(n % i != 0) {
                continue;
            }
            while(n % i == 0) {
                n = n / i;
            }
            list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}