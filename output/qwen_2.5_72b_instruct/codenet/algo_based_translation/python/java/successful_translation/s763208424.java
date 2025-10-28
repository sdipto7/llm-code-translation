
import java.util.PriorityQueue;
import java.util.Scanner;

public class s763208424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            a.add(-value);
        }
        
        for (int i = 0; i < m; i++) {
            int largest = -a.poll();
            int result = dis(largest, 1);
            a.add(-result);
        }
        
        int sum = 0;
        while (!a.isEmpty()) {
            sum += -a.poll();
        }
        
        System.out.println(sum);
        scanner.close();
    }
    
    public static int dis(int x, int y) {
        return x / (int) Math.pow(2, y);
    }
}

