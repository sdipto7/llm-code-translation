
import java.util.PriorityQueue;
import java.util.Scanner;

public class s016605598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int constValue = 0;
        PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int q = scanner.nextInt();
        int cnt = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < q; i++) {
            int t0 = scanner.nextInt();
            if (t0 == 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                constValue += b;
                if (cnt % 2 == 0) {
                    if (right.isEmpty()) {
                        left.add(a);
                        leftSum += a;
                        cnt++;
                        continue;
                    }
                    int c = right.poll();
                    rightSum -= c;
                    if (a <= c) {
                        left.add(a);
                        right.add(c);
                        leftSum += a;
                        rightSum += c;
                    } else {
                        left.add(c);
                        right.add(a);
                        leftSum += c;
                        rightSum += a;
                    }
                } else {
                    int c = left.poll();
                    leftSum -= c;
                    if (a <= -c) {
                        left.add(a);
                        right.add(-c);
                        leftSum += a;
                        rightSum -= c;
                    } else {
                        left.add(-c);
                        right.add(a);
                        leftSum -= c;
                        rightSum += a;
                    }
                }
                cnt++;
            } else {
                int tmp = left.peek();
                System.out.println(tmp + " " + (constValue - leftSum + rightSum + tmp * (cnt % 2)));
            }
        }
    }
}

