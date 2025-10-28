
import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }
        
        int[] cumSum = new int[n];
        for (int i = 1; i < n; i++) {
            cumSum[i] = cumSum[i - 1];
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumSum[i]++;
            }
        }
        
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            System.out.println(cumSum[r - 1] - cumSum[l - 1]);
        }
    }
}

