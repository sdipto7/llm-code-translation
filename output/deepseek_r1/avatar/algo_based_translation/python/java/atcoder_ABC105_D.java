
import java.util.HashMap;
import java.util.Scanner;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        
        String[] tokens = scanner.nextLine().split(" ");
        int[] modifiedA = new int[N + 1];
        modifiedA[0] = 0;
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(tokens[i - 1]);
            int remainder = num % M;
            if (remainder < 0) remainder += M;
            modifiedA[i] = remainder;
        }
        
        long[] cumSum = new long[N + 1];
        cumSum[0] = modifiedA[0];
        for (int i = 1; i <= N; i++) {
            cumSum[i] = cumSum[i - 1] + modifiedA[i];
        }
        
        HashMap<Integer, Integer> remainderCounts = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            long remainder = cumSum[i] % M;
            if (remainder < 0) remainder += M;
            int key = (int) remainder;
            remainderCounts.put(key, remainderCounts.getOrDefault(key, 0) + 1);
        }
        
        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }
        
        System.out.println(combinations);
    }
}

