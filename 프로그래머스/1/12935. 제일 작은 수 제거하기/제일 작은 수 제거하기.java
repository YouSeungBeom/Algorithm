import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int m = arr[0];
        for(int i : arr) {
            if(i < m) {
                m = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i == m)
                continue;
            list.add(i);
        }
        if(list.size() == 0) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}