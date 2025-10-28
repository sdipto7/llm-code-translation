
import java.util.*;

class Task {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
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
        int finishTime = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;

            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                result[i] = finishTime;
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    int[] temp = runTask(remaining, finishTime);
                    finishTime = temp[0];
                    result = Arrays.copyOf(temp, temp.length);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            int[] temp = runTask(remaining, finishTime);
            finishTime = temp[0];
            result = Arrays.copyOf(temp, temp.length);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] runTask(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        int[] result = new int[taskToRun.index + 1];
        return new int[]{finishTime, taskToRun.index, finishTime};
    }

    public static int[] updateResult(int[] result, int index, int value) {
        int[] newResult = Arrays.copyOf(result, Math.max(result.length, index + 1));
        newResult[index] = value;
        return newResult;
    }
}

