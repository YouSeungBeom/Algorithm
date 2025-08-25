import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for(String name : callings) {
            int curIdx = rank.get(name);
            int frontIdx = curIdx - 1;
            
            String frontName = players[frontIdx];
            
            players[curIdx] = frontName;
            players[frontIdx] = name;
            
            rank.put(name, frontIdx);
            rank.put(frontName, curIdx);
        }
        
        return players;
    }
}