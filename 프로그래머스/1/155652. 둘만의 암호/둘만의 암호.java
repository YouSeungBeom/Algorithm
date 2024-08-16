import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }
        
        for (char c : s.toCharArray()) {
            int count = 0;
            while (count < index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                if (!skipSet.contains(c)) {
                    count++;
                }
            }
            answer.append(c);
        }

        return answer.toString();
    }
}