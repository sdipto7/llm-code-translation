import java.util.*;
import java.io.*;

public class s267613210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int K = Integer.parseInt(firstLine[0]);
        int N = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(secondLine[i]);
        }
        
        List<Integer> dist = new ArrayList<>();
        for (int i = 0; i < A.length - 1; i++) {
            dist.add(A[i + 1] - A[i]);
        }
        dist.add(K + A[0] - A[A.length - 1]);
        
        int maxv = Collections.max(dist);
        int sum = 0;
        for (int d : dist) {
            sum += d;
        }
        System.out.println(sum - maxv);
    }
}
