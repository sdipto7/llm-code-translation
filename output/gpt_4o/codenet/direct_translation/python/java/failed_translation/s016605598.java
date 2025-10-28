
import java.util.PriorityQueue;
import java.util.Scanner;

public class s016605598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> left = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int constSum = 0;
        int cnt = 0;
        long leftSum = 0;
        long rightSum = 0;

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                constSum += b;
                if (cnt % 2 == 0) {
                    if (right.isEmpty()) {
                        left.offer(a);
                        leftSum += a;
                        cnt++;
                        continue;
                    }
                    int c = right.poll();
                    rightSum -= c;
                    if (a <= c) {
                        left.offer(a);
                        right.offer(c);
                        leftSum += a;
                        rightSum += c;
                    } else {
                        left.offer(c);
                        right.offer(a);
                        leftSum += c;
                        rightSum += a;
                    }
                } else {
                    int c = left.poll();
                    leftSum += c;
                    if (a <= -c) {
                        left.offer(a);
                        right.offer(-c);
                        leftSum += a;
                        rightSum -= c;
                    } else {
                        left.offer(c);
                        right.offer(a);
                        leftSum -= c;
                        rightSum += a;
                    }
                }
                cnt++;
            } else {
                int tmp = left.peek();
                System.out.println(tmp + " " + (constSum - leftSum + rightSum + tmp * (cnt % 2)));
            }
        }
        sc.close();
    }
}

