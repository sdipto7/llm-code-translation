import java.util.*;
import java.io.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        long[] A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] cumRemainders = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            cumRemainders[i] = (cumRemainders[i - 1] + A[i - 1]) % M;
        }
        Map<Long, Integer> remainderCounts = new HashMap<>();
        for (long r : cumRemainders) {
            remainderCounts.put(r, remainderCounts.getOrDefault(r, 0) + 1);
        }
        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}
