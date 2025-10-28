
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s103029464 {

    public static void main(String[] args) {
        Result result = processNumbers();
        System.out.println(result.sum);
        for (int index : result.indices) {
            System.out.print(index + " ");
        }
    }

    private static Result processNumbers() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        int[] B = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            int tmp_sum = 0;
            for (int j = (i + 1) * 2 - 1; j < N; j += i + 1) {
                tmp_sum += B[j];
                tmp_sum %= 2;
            }
            B[i] = tmp_sum ^ A[i];
        }

        int sum = 0;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (B[i] == 1) {
                sum++;
                indices.add(i + 1);
            }
        }
        
        scanner.close();
        return new Result(sum, indices);
    }

    private static class Result {
        int sum;
        List<Integer> indices;

        Result(int sum, List<Integer> indices) {
            this.sum = sum;
            this.indices = indices;
        }
    }
}

