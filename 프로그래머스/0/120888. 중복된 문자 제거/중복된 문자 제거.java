import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        for(String s : my_string.split("")) {
            set.add(s);
        }
        for(String s : set) {
            answer.append(s);
        }
        
        return answer.toString();
    }
}