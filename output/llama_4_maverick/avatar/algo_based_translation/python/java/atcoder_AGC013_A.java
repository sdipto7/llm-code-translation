
import java.util.*;
import java.io.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        int[] A = new int[strA.length];
        for (int i = 0; i < strA.length; i++) {
            A[i] = Integer.parseInt(strA[i]);
        }
        List<Integer> list = new ArrayList<>();
        int prev = A[0];
        list.add(prev);
        for (int i = 1; i < N; i++) {
            if (A[i] != prev) {
                prev = A[i];
                list.add(prev);
            }
        }
        N = list.size();
        int[] newA = new int[N];
        for (int i = 0; i < N; i++) {
            newA[i] = list.get(i);
        }
        int i = 1, ans = 0;
        while (i < N - 1) {
            if ((newA[i - 1] < newA[i] && newA[i] > newA[i + 1]) || (newA[i - 1] > newA[i] && newA[i] < newA[i + 1])) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}

