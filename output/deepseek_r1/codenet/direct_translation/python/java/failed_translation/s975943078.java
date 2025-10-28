Here is the Java code corresponding to the Python code provided. The code reads input, processes the array, and calculates the result using a similar approach with a HashMap to track the prefix sums modulo K. It uses binary search to efficiently find valid indices.


import java.io.*;
import java.util.*;

public class s975943078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);
        int[] A = new int[N];
        String[] elements = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(elements[i]);
            A[i] = (int) ((num % K) - 1);
        }

        int[] sum = new int[N + 1];
        Map<Integer, List<Integer>> modMap = new HashMap<>();
        modMap.put(0, new ArrayList<>());
        modMap.get(0).add(0);

        for (int i = 0; i < N; i++) {
            sum[i + 1] = (sum[i] + A[i]) % K;
            if (sum[i + 1] < 0) sum[i + 1] += K;
            int key = sum[i + 1];
            if (!modMap.containsKey(key)) {
                modMap.put(key, new ArrayList<>());
            }
            modMap.get(key).add(i + 1);
        }

        long count = 0;
        for (List<Integer> list : modMap.values()) {
            for (int i = 0; i < list.size(); i++) {
                int a = list.get(i);
                int left = i;
                int right = list.size();
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= a + K) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                count += (right - i - 1);
            }
        }

        System.out.println(count);
    }
}

