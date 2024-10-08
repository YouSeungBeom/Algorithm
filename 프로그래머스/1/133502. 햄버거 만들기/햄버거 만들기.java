import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i : ingredient) {
            list.add(i);
            int size = list.size();
            
            if(size >= 4 && 
               list.get(size - 1) == 1 && 
               list.get(size - 2) == 3 && 
               list.get(size - 3) == 2 && 
               list.get(size - 4) == 1) {
                list.remove(size - 1);
                list.remove(size - 2);
                list.remove(size - 3);
                list.remove(size - 4);
                answer++;
            }
        }
        return answer;
    }
}