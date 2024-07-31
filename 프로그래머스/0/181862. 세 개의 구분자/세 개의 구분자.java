import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : myStr.toCharArray()) {
            if(c == 'a' || c == 'b' || c == 'c') {
                if(sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        
        if(sb.length() > 0) {
            list.add(sb.toString());
        }
        
        if(list.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return list.toArray(new String[0]);
    }
}