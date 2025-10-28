
import java.util.*;
import java.io.*;

public class s846046431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = br.readLine().split(" ");
        Integer[] A = new Integer[secondLine.length];
        for (int i = 0; i < secondLine.length; i++) {
            A[i] = Integer.parseInt(secondLine[i]);
        }
        
        Arrays.sort(A, Collections.reverseOrder());
        
        int S = 0;
        for (int num : A) {
            S += num;
        }
        
        for (int i = 0; i < M; i++) {
            if (A[i] < S / (4.0 * M)) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}

