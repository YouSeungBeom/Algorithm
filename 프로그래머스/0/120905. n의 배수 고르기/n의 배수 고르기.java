import java.util.Stack;

class Solution {
    public int[] solution(int n, int[] numlist) {
        Stack<Integer> stack = new Stack();
        int idx = 0;
        int[] arr = new int[numlist.length];
        
        for(int i = 0; i < numlist.length; i++) {
            stack.push(numlist[i]);
            if(stack.peek() % n == 0) {
                arr[idx] = stack.peek();
                idx++;
            }
            stack.pop();
        }
        
        int[] answer = new int[idx];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}