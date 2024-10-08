import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i < N - 1; i++) {
        	for(int j = 0; j < N - i - 1; j++) {
        		if(arr[j] > arr[j + 1]) {
        			int temp = arr[j];
        			arr[j] = arr[j + 1];
        			arr[j + 1] = temp;
        		}
        	}
        }
        
        for(int i = 0; i < arr.length; i++) {
        	bw.write(Integer.toString(arr[i]) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}