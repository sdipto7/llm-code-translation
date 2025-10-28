
import java.util.PriorityQueue;
import java.util.Scanner;

public class s016605598 {
    public static void main(String[] args) {
        PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> right = new PriorityQueue<>();
        long constSum = 0;
        int cnt = 0;
        long leftSum = 0;
        long rightSum = 0;

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            if (type == 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                constSum += b;
                if (cnt % 2 == 0) {
                    if (right.isEmpty()) {
                        left.add(a);
                        leftSum += a;
                    } else {
                        int c = right.poll();
                        rightSum -= c;
                        if (a <= c) {
                            left.add(a);
                            leftSum += a;
                            right.add(c);
                            rightSum += c;
                        } else {
                            left.add(c);
                            leftSum += c;
                            right.add(a);
                            rightSum += a;
                        }
                    }
                } else {
                    int c = left.poll();
                    leftSum -= c;
                    if (a <= c) {
                        left.add(a);
                        leftSum += a;
                        right.add(c);
                        rightSum += c;
                    } else {
                        left.add(c);
                        leftSum += c;
                        right.add(a);
                        rightSum += a;
                    }
                }
                cnt++;
            } else {
                int tmp = left.peek();
                long res = constSum - leftSum + rightSum + tmp * (cnt % 2);
                System.out.println(tmp + " " + res);
            }
        }
        scanner.close();
    }
}

