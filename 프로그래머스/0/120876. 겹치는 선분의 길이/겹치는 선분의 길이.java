class Solution {
    public int solution(int[][] lines) {
        int min = 100;
        int max = -100;
        
        for (int[] line : lines) {
            if (line[0] < min) min = line[0];
            if (line[1] > max) max = line[1];
        }
        
        int[] arr = new int[max - min + 1];
        
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                arr[i - min]++;
            }
        }
        
        int answer = 0;
        for (int i : arr) {
            if (i > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}