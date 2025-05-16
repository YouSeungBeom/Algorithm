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
        Long A = Long.parseLong(input[0]);
        Long B = Long.parseLong(input[1]);
        Long C = Long.parseLong(input[2]);

        bw.write(A + B + C + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}