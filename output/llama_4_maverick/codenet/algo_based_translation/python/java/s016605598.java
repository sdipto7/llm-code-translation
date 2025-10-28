
import java.util.PriorityQueue;
import java.util.Scanner;

public class s016605598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int cnt = 0;
        long leftSum = 0;
        long rightSum = 0;
        long constVal = 0;

        for (int i = 0; i < q; i++) {
            int t = scanner.nextInt();
            if (t == 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                constVal += b;
                if (cnt % 2 == 0) {
                    if (right.isEmpty()) {
                        left.add(a);
                        leftSum += a;
                        cnt++;
                    } else {
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
                        cnt++;
                    }
                } else {
                    int c = left.poll();
                    leftSum -= c;
                    if (a <= c) {
                        left.add(a);
                        left.add(c);
                        leftSum += a;
                        leftSum += c;
                    } else {
                        left.add(c);
                        right.add(a);
                        leftSum += c;
                        rightSum += a;
                    }
                    cnt++;
                }
            } else {
                int tmp = left.peek();
                System.out.println(tmp + " " + (constVal - leftSum + rightSum + (cnt % 2 == 0 ? 0 : tmp)));
            }
        }
        scanner.close();
    }
}

