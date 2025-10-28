
import java.util.*;

public class s103029464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] aStr = sc.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(aStr[i]);
        }
        int[] B = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            int tmpSum = 0;
            int step = i + 1;
            int start = step * 2 - 1;
            for (int j = start; j < N; j += step) {
                tmpSum += B[j];
                tmpSum %= 2;
            }
            B[i] = tmpSum ^ A[i];
        }
        int sum = 0;
        for (int num : B) {
            sum += num;
        }
        List<Integer> indices = new ArrayList<>();
        for (int idx = 0; idx < N; idx++) {
            if (B[idx] == 1) {
                indices.add(idx + 1);
            }
        }
        System.out.println(sum);
        StringBuilder sb = new StringBuilder();
        for (int idx : indices) {
            sb.append(idx).append(" ");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
    }
}

