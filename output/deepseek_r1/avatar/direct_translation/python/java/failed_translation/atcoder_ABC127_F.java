
import java.io.*;
import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sumB = 0;
        long sumP1 = 0;
        long sumP2 = 0;
        for (int i = 0; i < q; i++) {
            String[] parts = br.readLine().split(" ");
            if (parts[0].equals("2")) {
                if (p1.size() == p2.size()) {
                    int median = p2.peek();
                    long res = sumP1 - p1.size() * median + p2.size() * median - sumP2 + sumB;
                    System.out.println(median + " " + res);
                } else {
                    int median = p1.peek();
                    long res = sumP1 - p1.size() * median + p2.size() * median - sumP2 + sumB;
                    System.out.println(median + " " + res);
                }
            } else {
                int a = Integer.parseInt(parts[1]);
                int b = Integer.parseInt(parts[2]);
                sumB += b;
                if (p1.isEmpty() || p1.peek() <= a) {
                    p1.add(a);
                    sumP1 += a;
                } else {
                    p2.add(a);
                    sumP2 += a;
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    sumP2 -= k;
                    p1.add(k);
                    sumP1 += k;
                } else if (p1.size() - p2.size() > 1) {
                    int k = p1.poll();
                    sumP1 -= k;
                    p2.add(k);
                    sumP2 += k;
                }
            }
        }
    }
}

