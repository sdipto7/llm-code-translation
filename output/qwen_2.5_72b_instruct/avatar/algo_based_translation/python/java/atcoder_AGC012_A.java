import java.util.*;
import java.io.*;

public class atcoder_AGC012_A {
    public static List<Integer> readInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : line) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> A = readInts();
        Collections.sort(A);
        int ans = 0;
        for (int i = A.size() - 2; i >= A.size() - 2 * n - 1; i -= 2) {
            ans += A.get(i);
        }
        System.out.println(ans);
    }
}
