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
            a.add(-dis(-a.remove(), 1));
        }
        int sum = 0;
        while (!a.isEmpty()) {
            sum -= a.remove();
        }
        System.out.println(sum);
    }

    static int dis(int x, int y) {
        return x / (int) Math.pow(2, y);
    }
}
