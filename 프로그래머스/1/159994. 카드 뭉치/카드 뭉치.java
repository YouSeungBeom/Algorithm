class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0, b = 0;
        
        for(int i = 0; i < goal.length; i++) {
            if(goal[i].equals(cards1[a])) {
                if(a < cards1.length - 1) {
                    a++;
                }
                continue;
            }
            else if(goal[i].equals(cards2[b])) {
                if(b < cards2.length - 1) {
                    b++;
                }
                continue;
            }
            else return "No";
        }
        return "Yes";
    }
}