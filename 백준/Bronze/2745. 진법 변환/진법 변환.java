import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int answer = 0;
		int a = 0;
		String[] s = br.readLine().split(" ");
		char[] ch = s[0].toCharArray();
		int N = Integer.parseInt(s[1]);
		
		int[] nums = new int[ch.length];
		
		for(int i = 0; i < nums.length; i++) {
			if('A' <= ch[i] && ch[i] <= 'Z') {
				nums[i] = ch[i] - 'A' + 10;
			} else {
				nums[i] = ch[i] - '0';
			}
		}
		for(int i = nums.length - 1; i >= 0; i--) {
			answer += nums[i] * (Math.pow(N, a++));
		}
		bw.write(Integer.toString(answer));
		bw.flush();
		bw.close();
		br.close();
	}
}