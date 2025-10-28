
import java.util.PriorityQueue;
import java.util.Scanner;

public class s016605598 {
    public static void main(String[] args) {
        int constValue = 0;
        PriorityQueue<Integer> left = new PriorityQueue<>((x, y) -> y - x);
        PriorityQueue<Integer> right = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int leftSum = 0;
        int rightSum = 0;
        int q = scanner.nextInt();
        
        for (int i = 0; i < q; i++) {
            int[] t = new int[3];
            t[0] = scanner.nextInt();
            if (t[0] == 1) {
                t[1] = scanner.nextInt();
                t[2] = scanner.nextInt();
                constValue += t[2];
                if (cnt % 2 == 0) {
                    if (right.isEmpty()) {
                        left.add(t[1]);
                        leftSum += t[1];
                        cnt++;
                        continue;
                    }
                    int c = right.poll();
                    rightSum -= c;
                    if (t[1] <= c) {
                        left.add(t[1]);
                        right.add(c);
                        leftSum += t[1];
                        rightSum += c;
                    } else {
                        left.add(c);
                        right.add(t[1]);
                        leftSum += c;
                        rightSum += t[1];
                    }
                } else {
                    int c = left.poll();
                    leftSum += c;
                    if (t[1] <= -c) {
                        left.add(t[1]);
                        right.add(-c);
                        leftSum += t[1];
                        rightSum -= c;
                    } else {
                        left.add(-c);
                        right.add(t[1]);
                        leftSum -= c;
                        rightSum += t[1];
                    }
                }
                cnt++;
            } else {
                int tmp = left.peek();
                System.out.println(tmp + " " + (constValue - leftSum + rightSum + tmp * (cnt % 2)));
            }
        }
        
        scanner.close();
    }
}

