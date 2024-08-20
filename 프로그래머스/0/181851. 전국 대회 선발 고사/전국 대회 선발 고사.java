import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        List<Integer> rank_list = Arrays.stream(rank).boxed().collect(Collectors.toList());
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        int a = rank_list.indexOf(list.get(0));
        int b = rank_list.indexOf(list.get(1));
        int c = rank_list.indexOf(list.get(2));
        
        return 10000 * a + 100 * b + c;
    }
}