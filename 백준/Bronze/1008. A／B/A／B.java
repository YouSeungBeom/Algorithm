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
        double A = Double.parseDouble(input[0]);
        double B = Double.parseDouble(input[1]);

        bw.write(Double.toString(A / B) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}