
import java.util.PriorityQueue;
import java.util.Scanner;

public class s763208424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Long> a = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            a.add(-scanner.nextLong());
        }

        for (int i = 0; i < m; i++) {
            long x = -a.poll();
            a.add(- (x / 2));
        }

        long sum = 0;
        while (!a.isEmpty()) {
            sum += -a.poll();
        }
        System.out.println(sum);
    }
}

