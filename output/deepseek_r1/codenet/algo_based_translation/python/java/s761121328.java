
import java.util.Scanner;

public class s761121328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().trim().split("\\s+");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        int s = A[0] ^ A[1];
        for (int i = 2; i < N; i++) {
            s ^= A[i];
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = s ^ A[i];
        }
        StringBuilder output = new StringBuilder();
        for (int num : B) {
            output.append(num).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}

