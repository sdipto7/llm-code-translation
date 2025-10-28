
import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.offer(new int[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            int[] temp = x.poll();
            int d = temp[0];
            int s = temp[1];
            int r = m - y.size();
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

