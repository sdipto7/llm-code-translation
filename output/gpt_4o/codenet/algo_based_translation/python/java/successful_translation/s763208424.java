
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
            a.offer(-value);
        }
        
        for (int i = 0; i < m; i++) {
            int largest = -a.poll();
            int newValue = dis(largest, 1);
            a.offer(-newValue);
        }
        
        int sum = 0;
        while (!a.isEmpty()) {
            sum += -a.poll();
        }
        
        System.out.println(sum);
        
        scanner.close();
    }
    
    private static int dis(int x, int y) {
        return x / (1 << y);
    }
}

