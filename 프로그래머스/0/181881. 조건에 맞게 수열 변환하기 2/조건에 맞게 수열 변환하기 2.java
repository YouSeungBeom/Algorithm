import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] array = new int[arr.length];
        int answer = 0;
        
        while(true) {
            for(int i = 0; i < arr.length; i++) {
                array[i] = arr[i];
                
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if(Arrays.equals(arr, array)) {
                break;
            }
            answer++;
        }
        return answer;
    }
}