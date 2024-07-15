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
        int[] count = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            count[i] = count[i - 1] + 1;
            
            if (i % 2 == 0) {
                count[i] = Math.min(count[i], count[i / 2] + 1);
            }
            
            if (i % 3 == 0) {
                count[i] = Math.min(count[i], count[i / 3] + 1);
            }
        }
		
		bw.write(Integer.toString(count[n]));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
