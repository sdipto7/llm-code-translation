import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] A = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            A[i] = Integer.parseInt(parts[i]);
        }
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}
