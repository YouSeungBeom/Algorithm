import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		int[] arr = new int[N];
		String[] str = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int count = 0;
		int A = 0, B = 0;
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
					A = j;
					B = j + 1;
				}
				if(count == k) {
					break;
				}
			}
			if(count == k) {
				break;
			}
		}
		
		if(count < k) {
			bw.write(Integer.toString(-1));
		}
		else if(count == k) {
			if(arr[A] <= arr[B]) {
				bw.write(arr[A] + " " + arr[B]);
			}
			else {
				bw.write(arr[B] + " " + arr[A]);
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}