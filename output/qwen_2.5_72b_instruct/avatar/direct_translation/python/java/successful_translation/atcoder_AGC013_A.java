
import java.util.*;
import java.io.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        List<Integer> uniqueA = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                uniqueA.add(A[i]);
            }
        }
        N = uniqueA.size();
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            if (uniqueA.get(i - 1) < uniqueA.get(i) && uniqueA.get(i) > uniqueA.get(i + 1) || uniqueA.get(i - 1) > uniqueA.get(i) && uniqueA.get(i) < uniqueA.get(i + 1)) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}

