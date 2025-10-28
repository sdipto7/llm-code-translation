
import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        List<Integer> y = new ArrayList<>();
        while (!x.isEmpty()) {
            int d = x.poll();
            int s = x.poll();
            int r = m - y.size();
            if (r >= -d) {
                y.add(-s);
            } else {
                y.add(-s);
                y.remove(Collections.min(y));
            }
        }
        int sum = 0;
        for (int num : y) {
            sum += num;
        }
        System.out.println(sum);
    }
}

