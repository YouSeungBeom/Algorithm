import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> A = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                A.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        
        A.add(count);
        
        int[] answer = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            answer[i] = A.get(i);
        }
        
        return answer;
    }
}