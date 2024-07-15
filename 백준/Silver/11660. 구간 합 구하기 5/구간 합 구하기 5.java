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
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        int[][] A = new int[N+1][N+1];
        int[][] D = new int[N+1][N+1];
        
        for(int i = 1; i <= N; i++) {
        	String[] s2 = br.readLine().split(" ");
        	for(int j = 1; j <= N; j++) {
        		A[i][j] = Integer.parseInt(s2[j-1]);
        		
        		D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
        	}
        }
        
        for(int i = 0; i < M; i++) {
        	int x1, y1, x2, y2;
        	String[] s3 = br.readLine().split(" ");
        	x1 = Integer.parseInt(s3[0]);
        	y1 = Integer.parseInt(s3[1]);
        	x2 = Integer.parseInt(s3[2]);
        	y2 = Integer.parseInt(s3[3]);
        	
        	int answer = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
        	bw.write(Integer.toString(answer) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}