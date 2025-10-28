
import java.util.Scanner;

public class s761121328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer input
        int N = Integer.parseInt(scanner.nextLine());

        // Read list of integers
        int[] A = new int[N];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        // Calculate XOR of the first two elements
        int s = A[0] ^ A[1];

        // Loop through the list starting from the third element
        for (int i = 2; i < N; i++) {
            // Update XOR result with the current element
            s = s ^ A[i];
        }

        // Initialize list B with zeros
        int[] B = new int[N];

        // Fill list B with XOR of s and each element in A
        for (int i = 0; i < N; i++) {
            B[i] = s ^ A[i];
        }

        // Convert each integer in B to a string and join with space separator
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(B[i]);
            if (i < N - 1) {
                result.append(" ");
            }
        }

        // Print the result
        System.out.println(result.toString());

        scanner.close();
    }
}

