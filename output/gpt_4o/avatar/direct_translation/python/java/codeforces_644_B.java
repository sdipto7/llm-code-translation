
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Task {
    int time;
    int duration;
    int index;

    Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}

public class codeforces_644_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finish_time = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;

            if (task.time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = task.time + task.duration;
                result[i] = finish_time;
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    finish_time = runTask(remaining, finish_time, result);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            finish_time = runTask(remaining, finish_time, result);
        }

        for (int res : result) {
            System.out.println(res);
        }
    }

    private static int runTask(Queue<Task> remaining, int finish_time, int[] result) {
        Task task_to_run = remaining.poll();
        finish_time = Math.max(finish_time, task_to_run.time) + task_to_run.duration;
        result[task_to_run.index] = finish_time;
        return finish_time;
    }
}

