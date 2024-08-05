import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] arr = Arrays.copyOf(numlist, numlist.length);
        for(int i = 0; i < numlist.length; i++) {
            arr[i] = Math.abs(numlist[i] - n);
        }
        Arrays.sort(arr);
        
        int[] answer = new int[numlist.length];
        
        for(int i = 0; i < answer.length; i++) {
            if(contains(numlist, arr[i] + n)) {
                answer[i] = arr[i] + n;
            }
            else {
                answer[i] = n - arr[i];
            }
            
            if(i != 0 && arr[i] == arr[i - 1]) {
                answer[i] = n - arr[i];
            }
        }
        return answer;
    }
    
    public boolean contains(int[] array, int element) {
        for (int value : array) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }
}