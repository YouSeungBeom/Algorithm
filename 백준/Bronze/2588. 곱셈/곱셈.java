import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split("");
        int a = A * Integer.parseInt(B[2]), b = A * Integer.parseInt(B[1]), c = A * Integer.parseInt(B[0]);

        bw.write(a + "\n");
        bw.write(b + "\n");
        bw.write(c + "\n");
        bw.write(a + (b * 10) + (c * 100) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}