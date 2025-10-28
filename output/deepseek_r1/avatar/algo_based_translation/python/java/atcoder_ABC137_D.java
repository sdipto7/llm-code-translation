
import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(new int[]{-day, -salary});
        }
        
        PriorityQueue<Integer> y = new PriorityQueue<>();
        while (!x.isEmpty()) {
            int[] job = x.poll();
            int d = job[0];
            int s = job[1];
            int requiredDays = -d;
            int currentSalary = -s;
            int remainingSlots = m - y.size();
            
            y.add(currentSalary);
            if (remainingSlots < requiredDays) {
                y.poll();
            }
        }
        
        int total = 0;
        while (!y.isEmpty()) {
            total += y.poll();
        }
        System.out.println(total);
    }
}

