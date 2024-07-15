import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        
        String[] s2 = br.readLine().split(" ");
        int[] num = new int[n + 1];
        int[] sum = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(s2[i - 1]);
            sum[i] = sum[i - 1] + num[i];
        }
        
        for (int i = 0; i < m; i++) {
            String[] s3 = br.readLine().split(" ");
            int a = Integer.parseInt(s3[0]);
            int b = Integer.parseInt(s3[1]);
            
            bw.write((sum[b] - sum[a - 1]) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}