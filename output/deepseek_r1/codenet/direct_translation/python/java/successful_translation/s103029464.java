
import java.util.*;

public class s103029464 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            int tmpSum = 0;
            for (int j = (i + 1) * 2 - 1; j < N; j += i + 1) {
                tmpSum += B[j];
            }
            tmpSum %= 2;
            B[i] = tmpSum ^ A[i];
        }
        int sum = 0;
        for (int b : B) {
            sum += b;
        }
        System.out.println(sum);
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (B[i] == 1) {
                indices.add(i + 1);
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int idx : indices) {
            sj.add(Integer.toString(idx));
        }
        System.out.println(sj.toString());
    }
}

