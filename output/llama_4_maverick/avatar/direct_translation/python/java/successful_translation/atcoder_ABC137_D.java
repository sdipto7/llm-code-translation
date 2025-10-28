
import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<long[]> x = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        PriorityQueue<Long> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            long day = scanner.nextLong();
            long salary = scanner.nextLong();
            x.offer(new long[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            long[] arr = x.poll();
            long d = arr[0];
            long s = arr[1];
            long r = m - y.size();
            if (r >= -d) {
                y.offer(-s);
            } else {
                y.offer(-s);
                y.poll();
            }
        }
        long sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}

