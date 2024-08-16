import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        double[] fails = new double[N];
        
        for(int i = 0; i < N; i++) {
            int total = 0;
            int cnt = 0;
            
            for(int j : stages) {
                if(j >= i + 1) {
                    total++;
                }
                if(j == i + 1) {
                    cnt++;
                }
            }
            
            if(total == 0) {
                fails[i] = 0;
                continue;
            }
            fails[i] = (double) cnt / total;
        }
        
        Arrays.sort(arr, (i1, i2) -> Double.compare(fails[i2 - 1], fails[i1 - 1]));
        
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) {
            answer[i] = arr[i];
        }
        
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}