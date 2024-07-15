import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] num = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(s[i]);
            num[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(num);
        int M = num[n-1];
        
        double avg = ((double) sum / M * 100) / n;
        
		bw.write(Double.toString(avg));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
