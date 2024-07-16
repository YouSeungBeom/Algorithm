import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        
        int current = 1;
        boolean possible = true;
        
        for (int i = 0; i < n; i++) {
            int num = A[i];
            
            if (num >= current) {
                while (num >= current) {
                    stack.push(current++);
                    answer.append("+\n");
                }
                stack.pop();
                answer.append("-\n");
            } 
            else {
                if (stack.peek() == num) {
                    stack.pop();
                    answer.append("-\n");
                }
                else {
                    possible = false;
                    break;
                }
            }
        }
        
        if (possible) {
            bw.write(answer.toString());
        }
        else {
            bw.write("NO");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}