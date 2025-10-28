
import java.util.*;
import java.io.*;

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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int b = Integer.parseInt(firstLine[1]);
        
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;
        Map<Integer, Integer> result = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int time = Integer.parseInt(line[0]);
            int duration = Integer.parseInt(line[1]);
            Task task = new Task(time, duration, i);
            result.put(i, 0);
            
            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                result.put(i, finishTime);
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    Task taskToRun = remaining.poll();
                    finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
                    result.put(taskToRun.index, finishTime);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }
        
        while (!remaining.isEmpty()) {
            Task taskToRun = remaining.poll();
            finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
            result.put(taskToRun.index, finishTime);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(result.get(i));
        }
    }
}

