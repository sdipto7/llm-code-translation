
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class atcoder_ABC137_D {

    public static int calculateMaximumSalary(int n, int m, List<int[]> jobs) {
        PriorityQueue<int[]> x = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> y = new PriorityQueue<>();

        for (int[] job : jobs) {
            int day = job[0];
            int salary = job[1];
            x.offer(new int[]{-day, -salary});
        }

        while (!x.isEmpty()) {
            int[] top = x.poll();
            int d = top[0];
            int s = top[1];
            int r = m - y.size();

            if (r >= -d) {
                y.offer(-s);
            } else {
                y.offer(-s);
                y.poll();
            }
        }

        int totalSalary = 0;
        for (int salary : y) {
            totalSalary += salary;
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<int[]> jobs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            jobs.add(new int[]{day, salary});
        }

        int result = calculateMaximumSalary(n, m, jobs);
        System.out.println(result);
    }
}

