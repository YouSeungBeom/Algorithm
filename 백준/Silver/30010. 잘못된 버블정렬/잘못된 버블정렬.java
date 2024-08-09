import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				A[i]++;
			}
		}
		
		A[N - 1] = 0;
		
		for(int i = 0; i < N; i++) {
			bw.write(Integer.toString(A[i]) + " ");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}