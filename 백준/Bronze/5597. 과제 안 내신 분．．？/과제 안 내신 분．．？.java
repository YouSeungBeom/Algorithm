import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] report = new int[30];

        for (int i = 0; i < 28; i++) {
            report[Integer.parseInt(br.readLine()) - 1]++;
        }

        for(int i = 1; i <= 30; i++) {
            if(report[i - 1] == 0) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}