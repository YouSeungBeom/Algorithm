import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[] baskets = new int[N];

        for (int shooting = 0; shooting < M; shooting++) {
            String[] line = br.readLine().split(" ");
            int i = Integer.parseInt(line[0]);
            int j = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);

            for (int x = i; x <= j; x++) {
                baskets[x - 1] = k;
            }
        }

        for (int num : baskets) {
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}