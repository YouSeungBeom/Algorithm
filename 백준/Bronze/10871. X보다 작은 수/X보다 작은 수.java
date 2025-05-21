import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine().split(" ")[1]);
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");

        for(String s : input) {
            if(Integer.parseInt(s) < X) {
                sb.append(s + " ");
            }
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}