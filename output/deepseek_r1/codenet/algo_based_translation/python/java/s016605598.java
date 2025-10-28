
import java.util.*;

public class s016605598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long constant = 0;
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int q = sc.nextInt();
        int cnt = 0;
        long leftSum = 0;
        long rightSum = 0;
        
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                constant += b;
                
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
                        leftSum += a;
                        right.add(c);
                        rightSum += c;
                    } else {
                        left.add(c);
                        leftSum += c;
                        right.add(a);
                        rightSum += a;
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
                long result = constant - leftSum + rightSum + tmp * (cnt % 2);
                System.out.println(tmp + " " + result);
            }
        }
        sc.close();
    }
}

