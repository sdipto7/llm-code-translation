import java.util.PriorityQueue;
import java.util.Scanner;

public class s763208424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(-sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int max = -a.poll();
            a.add(-(max / 2));
        }
        long sum = 0;
        while (!a.isEmpty()) {
            sum += -a.poll();
        }
        System.out.println(sum);
    }
}
