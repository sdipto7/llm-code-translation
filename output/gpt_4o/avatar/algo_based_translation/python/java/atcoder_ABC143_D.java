
import java.util.*;
import java.io.*;

public class atcoder_ABC143_D {

    public static int countTriangleCombinations(int n, List<Integer> l) {
        Collections.sort(l);
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l.get(i);
                int b = l.get(j);

                int right = Collections.binarySearch(l, a + b);
                if (right < 0) {
                    right = -right - 1;
                }
                int left = Collections.binarySearch(l, Math.max(a - b, b - a));
                if (left < 0) {
                    left = -left - 1;
                } else {
                    left++;
                }

                int tmp = Math.max(0, right - left);

                if (left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }

                ans += tmp;
            }
        }

        return ans / 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < input.length; i++) {
            l.add(Integer.parseInt(input[i]));
        }

        System.out.println(countTriangleCombinations(n, l));
    }
}

