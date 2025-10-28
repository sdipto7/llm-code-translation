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
        int finish_time = 0;
        Map<Integer, Integer> result = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            if (task.time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = task.time + task.duration;
                result.put(i, finish_time);
            } else {
                if (task.time >= finish_time && !remaining.isEmpty()) {
                    finish_time = runTask(remaining, finish_time, result);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }
        
        while (!remaining.isEmpty()) {
            finish_time = runTask(remaining, finish_time, result);
        }
        
        for (int key : result.keySet()) {
            System.out.println(result.get(key));
        }
    }
    
    private static int runTask(Queue<Task> remaining, int finish_time, Map<Integer, Integer> result) {
        Task taskToRun = remaining.poll();
        finish_time = Math.max(finish_time, taskToRun.time) + taskToRun.duration;
        result.put(taskToRun.index, finish_time);
        return finish_time;
    }
}
