
import java.util.*;
import java.io.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int[] ans = {0, 0};
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        
        for (int i = 0; i < q; i++) {
            String[] parts = br.readLine().split(" ");
            int[] ql = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                ql[j] = Integer.parseInt(parts[j]);
            }
            
            if (ql[0] == 2) {
                long median;
                long cost;
                if (p1.size() == p2.size()) {
                    median = -p2.peek();
                    cost = sum_p1 - p1.size() * median + p2.size() * median - sum_p2 + sum_b;
                } else {
                    median = p1.peek();
                    cost = sum_p1 - p1.size() * median + p2.size() * median - sum_p2 + sum_b;
                }
                System.out.println(median + " " + cost);
            } else {
                sum_b += ql[2];
                if (p1.isEmpty() || p1.peek() <= ql[1]) {
                    p1.offer(ql[1]);
                    sum_p1 += ql[1];
                } else {
                    p2.offer(-ql[1]);
                    sum_p2 += ql[1];
                }
                
                if (p1.size() < p2.size()) {
                    int k = -p2.poll();
                    p1.offer(k);
                    sum_p2 -= k;
                    sum_p1 += k;
                }
                
                if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.offer(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

