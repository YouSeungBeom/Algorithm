import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        if(M < 45) {
            H--;
            M += 15;
        } else {
            M -= 45;
        }
        
        if (H < 0) H += 24;
        bw.write(H + " " + M);

        bw.flush();
        bw.close();
        br.close();
    }
}