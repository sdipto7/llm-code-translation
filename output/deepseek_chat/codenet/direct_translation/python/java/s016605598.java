
import java.util.*;

public class s016605598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int const_ = 0;
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int q = sc.nextInt();
        int cnt = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < q; i++) {
            int[] t = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (t.length == 1) {
                t = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            if (t[0] == 1) {
                int a = t[1];
                int b = t[2];
                const_ += b;
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
                    leftSum += c;
                    if (a <= -c) {
                        left.add(-a);
                        right.add(-c);
                        leftSum += a;
                        rightSum -= c;
                    } else {
                        left.add(c);
                        right.add(a);
                        leftSum -= c;
                        rightSum += a;
                    }
                }
                cnt++;
            } else {
                int tmp = -left.peek();
                System.out.println(tmp + " " + (const_ - leftSum + rightSum + tmp * (cnt % 2)));
            }
        }
    }
}

