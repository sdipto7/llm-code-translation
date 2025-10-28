
import java.util.PriorityQueue;
import java.util.Scanner;

public class s763208424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        String[] nums = scanner.nextLine().split(" ");
        for (String num : nums) {
            int value = Integer.parseInt(num);
            heap.add(-value);
        }
        
        for (int i = 0; i < m; i++) {
            int current = heap.poll();
            int newVal = -((-current) / 2);
            heap.add(newVal);
        }
        
        int sum = 0;
        while (!heap.isEmpty()) {
            sum += heap.poll();
        }
        System.out.println(-sum);
    }
}

