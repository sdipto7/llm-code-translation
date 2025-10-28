
import java.util.PriorityQueue;
import java.util.Scanner;

public class s763208424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            heap.add(-value);
        }
        
        for (int i = 0; i < m; i++) {
            int current = -heap.poll();
            int newValue = current / 2;
            heap.add(-newValue);
        }
        
        long sum = 0;
        while (!heap.isEmpty()) {
            sum += -heap.poll();
        }
        
        System.out.println(sum);
    }
}

