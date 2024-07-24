import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            String num = Integer.toString(i);
            boolean is05 = true;
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) != '0' && num.charAt(j) != '5') {
                    is05 = false;
                    break;
                }
            }
            if(is05)
                list.add(i);
        }
        if(list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}