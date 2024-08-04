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
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
				case "push" : 
					stack.push(Integer.parseInt(str[1]));
					break;
				case "pop" : 
					if(stack.isEmpty()) {
						bw.write("-1" + "\n");
						break;
					}
					bw.write(Integer.toString(stack.pop()) + "\n");
					break;
				case "size" : 
					bw.write(Integer.toString(stack.size()) + "\n");
					break;
				case "empty" : 
					if(stack.isEmpty()) {
						bw.write("1" + "\n");
						break;
					}
					bw.write("0" + "\n");
					break;
				case "top" : 
					if(stack.isEmpty()) {
						bw.write("-1" + "\n");
						break;
					}
					bw.write(Integer.toString(stack.peek()) + "\n");
					break;
					
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}