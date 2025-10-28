
import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Job> x = new PriorityQueue<>((a, b) -> {
            if (a.day != b.day) return b.day - a.day;
            return b.salary - a.salary;
        });
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(new Job(day, salary));
        }
        PriorityQueue<Integer> y = new PriorityQueue<>();
        while (!x.isEmpty()) {
            Job job = x.poll();
            int r = m - y.size();
            if (r >= job.day) {
                y.add(job.salary);
            } else {
                y.add(job.salary);
                y.poll();
            }
        }
        long sum = 0;
        for (int s : y) sum += s;
        System.out.println(sum);
    }

    static class Job {
        int day, salary;
        Job(int d, int s) { day = d; salary = s; }
    }
}

