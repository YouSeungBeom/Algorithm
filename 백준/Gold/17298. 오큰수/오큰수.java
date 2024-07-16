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
        Stack<Integer> mystack = new Stack<>();
        
        int[] answer = new int[N];
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(s[i]);
            
            while (!mystack.isEmpty() && Integer.parseInt(s[mystack.peek()]) < num) {
                answer[mystack.pop()] = num;
            }
            mystack.push(i);
        }
        
        while (!mystack.isEmpty()) {
            answer[mystack.pop()] = -1;
        }
        
        for (int i : answer) {
            bw.write(i + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}