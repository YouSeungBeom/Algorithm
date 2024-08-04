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
		
		String p = br.readLine();
        Stack<Character> stack = new Stack<>();
        
        for (char ch : p.toCharArray()) {
            stack.push(ch);
            
            if (stack.size() >= 4 && stack.peek() == 'P') {
                if (stack.get(stack.size() - 2) == 'A' && stack.get(stack.size() - 3) == 'P' && stack.get(stack.size() - 4) == 'P') {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.push('P');
                }
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        if (result.toString().equals("P")) {
            bw.write("PPAP");
        } else {
            bw.write("NP");
        }
        
		bw.flush();
		bw.close();
		br.close();
	}
}