class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int[] answer = new int[2];
        
        for (int w = 3; w <= Math.sqrt(area); w++) {
            if (area % w == 0) {
                int h = area / w;
                if ((w - 2) * (h - 2) == yellow) {
                    answer[0] = Math.max(w, h);
                    answer[1] = Math.min(w, h);
                    break;
                }
            }
        }
        return answer;
    }
}