import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                list.add(i);
            }
        }
        
        list.sort(Comparator.comparingInt(i -> rank[i]));
        
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        
        return 10000 * a + 100 * b + c;
    }
}