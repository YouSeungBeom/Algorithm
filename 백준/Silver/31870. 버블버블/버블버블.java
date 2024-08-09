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
		int[] B = new int[N];
		String[] str = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(str[i]);
			B[i] = Integer.parseInt(str[i]);
		}
		int a = 0, b = 0;
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N - 1 - i; j++) {
				if(A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					a++;
				}
			}
		}
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N - 1 - i; j++) {
				if(B[j] < B[j + 1]) {
					int temp = B[j];
					B[j] = B[j+1];
					B[j+1] = temp;
					b++;
				}
			}
		}
		
		bw.write(Integer.toString(Math.min(a, b + 1)));
		
		bw.flush();
		bw.close();
		br.close();
	}
}