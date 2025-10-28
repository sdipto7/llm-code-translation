
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s103029464 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Result result = solve(N, A);
        System.out.println(result.sum);
        System.out.println(result.indices);
    }

    public static Result solve(int N, int[] A) {
        int[] B = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            int tmpSum = 0;
            for (int j = (i + 1) * 2 - 1; j < N; j += i + 1) {
                tmpSum += B[j];
                tmpSum %= 2;
            }
            B[i] = tmpSum ^ A[i];
        }
        int sum = 0;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sum += B[i];
            if (B[i] == 1) {
                indices.add(i + 1);
            }
        }
        return new Result(sum, indices);
    }

    public static class Result {
        int sum;
        List<Integer> indices;

        public Result(int sum, List<Integer> indices) {
            this.sum = sum;
            this.indices = indices;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int index : indices) {
                sb.append(index).append(" ");
            }
            return sb.toString().trim();
        }
    }
}

