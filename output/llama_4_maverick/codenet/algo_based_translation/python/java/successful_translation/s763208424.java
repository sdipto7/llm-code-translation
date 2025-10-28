
import java.util.PriorityQueue;
import java.util.Scanner;

public class s763208424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            a.add(-scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            int temp = -a.poll();
            a.add(-dis(temp, 1));
        }

        long sum = 0;
        while (!a.isEmpty()) {
            sum += -a.poll();
        }

        System.out.println(sum);
    }

    public static int dis(int x, int y) {
        return x / (1 << y);
    }
}

