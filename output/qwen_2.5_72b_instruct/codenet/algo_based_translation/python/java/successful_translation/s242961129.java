import java.util.Scanner;
import java.util.ArrayList;

public class s242961129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        int ans = Math.abs(A.get(N - 1));
        A.add(0, 0);
        A.add(0);
        ArrayList<Integer> diff = new ArrayList<>(java.util.Collections.nCopies(N, 0));
        for (int i = 1; i <= N; i++) {
            int dif = Math.abs(A.get(i) - A.get(i - 1)) + Math.abs(A.get(i) - A.get(i + 1)) - Math.abs(A.get(i - 1) - A.get(i + 1));
            ans += Math.abs(A.get(i) - A.get(i - 1));
            diff.set(i - 1, dif);
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans - diff.get(i));
        }
    }
}
