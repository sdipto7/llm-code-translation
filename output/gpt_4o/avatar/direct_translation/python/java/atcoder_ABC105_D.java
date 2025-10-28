
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC105_D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        
        long[] A = new long[N];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(tokenizer.nextToken());
        }
        
        long[] cumRemainders = new long[N + 1];
        Map<Long, Integer> remainderCounts = new HashMap<>();
        remainderCounts.put(0L, 1);
        
        for (int i = 0; i < N; i++) {
            cumRemainders[i + 1] = (cumRemainders[i] + A[i]) % M;
            remainderCounts.put(cumRemainders[i + 1], remainderCounts.getOrDefault(cumRemainders[i + 1], 0) + 1);
        }
        
        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }
        
        System.out.println(combinations);
    }
}

