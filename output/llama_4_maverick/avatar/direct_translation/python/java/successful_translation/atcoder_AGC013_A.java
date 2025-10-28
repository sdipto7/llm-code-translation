
import java.util.*;
import java.io.*;

public class atcoder_AGC013_A {
    static final int mod = (int) (1e9 + 7);
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strA[i]);
        }

        List<Integer> list = new ArrayList<>();
        int prev = A[0];
        list.add(prev);
        for (int i = 1; i < N; i++) {
            if (A[i] != prev) {
                list.add(A[i]);
                prev = A[i];
            }
        }

        N = list.size();
        int[] newA = new int[N];
        for (int i = 0; i < N; i++) {
            newA[i] = list.get(i);
        }

        int ans = 0;
        int i = 1;
        while (i < N - 1) {
            if ((newA[i - 1] < newA[i] && newA[i] > newA[i + 1]) || (newA[i - 1] > newA[i] && newA[i] < newA[i + 1])) {
                ans++;
                i++;
            }
            i++;
        }
        pw.println(ans + 1);
        pw.flush();
    }
}

