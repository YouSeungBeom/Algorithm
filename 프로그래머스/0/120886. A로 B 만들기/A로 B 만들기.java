class Solution {
    public int solution(String before, String after) {
        int[] arr = new int[26];
        for(char c : before.toCharArray()) {
            arr[c - 'a']++;
        }
        for(char c : after.toCharArray()) {
            arr[c - 'a']--;
        }
        for(int i : arr) {
            if(i != 0) return 0;
        }
        return 1;
    }
}