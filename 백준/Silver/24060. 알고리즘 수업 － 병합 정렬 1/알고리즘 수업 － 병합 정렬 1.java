import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	static int[] arr;
	static int[] tmp;
	static int count;
	static int k;
	static int num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		
		arr = new int[N + 1];
		tmp = new int[N + 1];
		count = 0;
		num = -1;
		
		String[] str = br.readLine().split(" ");
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(str[i - 1]);
		}
		
		bw.write(Integer.toString(merge_sort(1, N)));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int merge_sort(int s, int e) {
		if(e - s < 1) {
			return num;
		}
		
		int m = s + (e - s) / 2;
		
		int result = merge_sort(s, m);
		result = merge_sort(m + 1, e);
		
		for(int i = s; i <= e; i++) {
			tmp[i] = arr[i];
		}
		
		int j = s;
		int idx1 = s;
		int idx2 = m + 1;
		
		while(idx1 <= m && idx2 <= e) {
			if(tmp[idx1] > tmp[idx2]) {
				arr[j] = tmp[idx2];
				count++;
				if(count == k) {
					return num = arr[j];
				}
				j++;
				idx2++;
			} 
			else {
				arr[j] = tmp[idx1];
				count++;
				if(count == k) {
					return num = arr[j];
				}
				j++;
				idx1++;
			}
		}
		
		while(idx1 <= m) {
			arr[j] = tmp[idx1];
			count++;
			if(count == k) {
				return num = arr[j];
			}
			j++;
			idx1++;
		}
		
		while(idx2 <= e) {
			arr[j] = tmp[idx2];
			count++;
			if(count == k) {
				return num = arr[j];
			}
			j++;
			idx2++;
		}
		return num;
	}
}