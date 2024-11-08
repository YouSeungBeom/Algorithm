import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr) {
            while(!stack.isEmpty() && stack.peek() >= i) {
                stack.pop();
            }
            stack.push(i);
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}