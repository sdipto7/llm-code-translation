
import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        long[] ans = new long[2];
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        long sum_b = 0, sum_p1 = 0, sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            if (queryType == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += scanner.nextLong();
                long num = scanner.nextLong();
                if (p1.isEmpty()) {
                    p1.add(num);
                    sum_p1 += num;
                } else if (p1.peek() <= num) {
                    p1.add(num);
                    sum_p1 += num;
                } else {
                    p2.add(num);
                    sum_p2 += num;
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(k);
                    sum_p2 -= k;
                    sum_p1 += k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}

