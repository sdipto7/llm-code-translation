
import java.util.*;
import java.io.*;

public class atcoder_ABC127_F {
    
    public static List<int[]> processQueries(int q, List<int[]> queries) {
        List<int[]> ans = new ArrayList<>();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;

        for (int i = 0; i < q; i++) {
            int[] ql = queries.get(i);
            if (ql[0] == 2) {
                if (p1.size() == p2.size()) {
                    int result1 = -p2.peek();
                    int result2 = sum_p1 - p1.size() * (-p2.peek()) + p2.size() * (-p2.peek()) - sum_p2 + sum_b;
                    ans.add(new int[]{result1, result2});
                } else {
                    int result1 = p1.peek();
                    int result2 = sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b;
                    ans.add(new int[]{result1, result2});
                }
            } else {
                sum_b += ql[2];
                if (p1.isEmpty()) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else if (p1.peek() <= ql[1]) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else {
                    p2.add(-ql[1]);
                    sum_p2 += ql[1];
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        List<int[]> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] parts = reader.readLine().split(" ");
            int[] ql = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                ql[j] = Integer.parseInt(parts[j]);
            }
            queries.add(ql);
        }

        List<int[]> result = processQueries(q, queries);
        for (int[] res : result) {
            System.out.println(res[0] + " " + res[1]);
        }
    }
}

