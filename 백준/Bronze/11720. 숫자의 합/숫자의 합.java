import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("");
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(s[i]);
        }
		
		bw.write(Integer.toString(sum));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
