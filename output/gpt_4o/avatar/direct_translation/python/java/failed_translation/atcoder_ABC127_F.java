
import java.util.Scanner;
import java.util.PriorityQueue;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        int[] ans = {0, 0};
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;

        for (int i = 0; i < q; i++) {
            String[] ql = scanner.nextLine().split(" ");
            int type = Integer.parseInt(ql[0]);

            if (type == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                int a = Integer.parseInt(ql[1]);
                int b = Integer.parseInt(ql[2]);
                sum_b += b;

                if (p1.isEmpty()) {
                    p1.offer(a);
                    sum_p1 += a;
                } else if (p1.peek() <= a) {
                    p1.offer(a);
                    sum_p1 += a;
                } else {
                    p2.offer(-a);
                    sum_p2 += a;
                }

                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.offer(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }

                if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.offer(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
        scanner.close();
    }
}

