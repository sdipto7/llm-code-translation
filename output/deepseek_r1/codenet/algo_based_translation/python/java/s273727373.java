
import java.util.Scanner;
import java.util.Arrays;

public class s273727373 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] A = new int[N];
        String[] inputValues = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputValues[i]);
        }
        int[] B = Arrays.copyOf(A, A.length);
        int count = 1;
        for (int value : A) {
            B[value - 1] = count;
            count++;
        }
        String[] result = new String[B.length];
        for (int i = 0; i < B.length; i++) {
            result[i] = String.valueOf(B[i]);
        }
        System.out.println(String.join(" ", result));
    }
}

