import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(String key : keymap) {
            for(int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int press = i + 1;
                
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), press));
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int total = 0;
            boolean possible = true;
            
            for(char c : target.toCharArray()) {
                if(map.containsKey(c)) {
                    total += map.get(c);
                }
                else {
                    possible = false;
                    break;
                }
            }
            
            answer[i] = possible ? total : -1;
        }
        return answer;
    }
}