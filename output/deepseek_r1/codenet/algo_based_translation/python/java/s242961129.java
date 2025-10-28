
import java.util.Scanner;

public class s242961129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split("\\s+");
        int[] originalA = new int[N];
        for (int i = 0; i < N; i++) {
            originalA[i] = Integer.parseInt(parts[i]);
        }
        int ans = Math.abs(originalA[originalA.length - 1]);
        int[] modifiedA = new int[N + 2];
        modifiedA[0] = 0;
        modifiedA[N + 1] = 0;
        for (int i = 1; i <= N; i++) {
            modifiedA[i] = originalA[i - 1];
        }
        int[] diff = new int[N];
        for (int i = 1; i <= N; i++) {
            int current = modifiedA[i];
            int prev = modifiedA[i - 1];
            int next = modifiedA[i + 1];
            int dif = (Math.abs(current - prev) + Math.abs(current - next)) - Math.abs(prev - next);
            ans += Math.abs(current - prev);
            diff[i - 1] = dif;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans - diff[i]);
        }
    }
}

