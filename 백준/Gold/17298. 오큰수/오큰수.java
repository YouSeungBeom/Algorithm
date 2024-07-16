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
        
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Stack<Integer> mystack = new Stack();

        mystack.push(0);
        
        int[] A = new int[N];
        int[] answer = new int[N];
        
        for(int i = 0; i < N; i++) {
        	A[i] = Integer.parseInt(s[i]);
        }
        
        for(int i = 1; i < N; i++) {
        	while(!mystack.empty() && A[mystack.peek()] < A[i]) {
        		answer[mystack.peek()] = A[i];
        		mystack.pop();
        	}
        	mystack.push(i);
        }
        while(!mystack.empty()) {
        	answer[mystack.peek()] = -1;
        	mystack.pop();
        }
        for(int i : answer) {
        	bw.write(Integer.toString(i) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}