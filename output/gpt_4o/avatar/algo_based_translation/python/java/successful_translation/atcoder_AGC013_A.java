
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        List<Integer> A = Arrays.stream(br.readLine().trim().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        // Remove consecutive duplicates
        List<Integer> newA = new ArrayList<>();
        int previous = A.get(0);
        newA.add(previous);
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) != previous) {
                newA.add(A.get(i));
                previous = A.get(i);
            }
        }
        A = newA;
        N = A.size();

        int i = 1;
        int ans = 0;

        while (i < N - 1) {
            if ((A.get(i - 1) < A.get(i) && A.get(i) > A.get(i + 1)) ||
                (A.get(i - 1) > A.get(i) && A.get(i) < A.get(i + 1))) {
                ans++;
                i++;
            }
            i++;
        }
        
        System.out.println(ans + 1);
    }
}

