
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        if (A.length >= 4 && (A[1] <= A[2] || A[3] <= A[0])) {
            System.out.println(0);
        } else if (A.length >= 4) {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}

