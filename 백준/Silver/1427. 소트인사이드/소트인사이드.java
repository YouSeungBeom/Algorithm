import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] s = br.readLine().split("");
        int[] arr = new int[s.length];
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = Integer.parseInt(s[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
        	int max = arr[i];
        	for(int j = i; j < arr.length; j++) {
        		if(max < arr[j]) {
        			int temp = max;
        			max = arr[j];
        			arr[j] = temp;
        		}
        	}
        	arr[i] = max;
        }
        for(int i = 0; i < arr.length; i++) {
        	bw.write(Integer.toString(arr[i]));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}