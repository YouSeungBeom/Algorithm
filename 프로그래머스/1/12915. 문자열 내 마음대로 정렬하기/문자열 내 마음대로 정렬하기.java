import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        
        list.sort(Comparator.comparing((String str) -> str.charAt(n))
                           .thenComparing(Comparator.naturalOrder()));
        
        return list.toArray(new String[0]);
    }
}