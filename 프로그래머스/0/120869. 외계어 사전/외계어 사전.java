class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String str : dic) {
            boolean flag = true;
            String word = str;
            
            for (String s : spell) {
                if (word.contains(s)) {
                    word = word.replaceFirst(s, "");
                }
                else {
                    flag = false;
                    break;
                }
            }
            
            if (flag && word.isEmpty()) {
                return 1;
            }
        }
        return 2;
    }
}