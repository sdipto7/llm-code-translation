
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
            int tmp_sum = 0;
            for (int j = (i + 1) * 2 - 1; j < N; j += i + 1) {
                tmp_sum += B[j];
                tmp_sum %= 2;
            }
            B[i] = tmp_sum ^ A[i];
        }

        int sumB = 0;
        for (int b : B) {
            sumB += b;
        }
        System.out.println(sumB);

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (B[i] == 1) {
                indices.add(i + 1);
            }
        }

        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i));
            if (i < indices.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

