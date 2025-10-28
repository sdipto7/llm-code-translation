
import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer input
        int y = Integer.parseInt(scanner.nextLine());

        // Accept a space-separated input of integers and store in an array
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int index = 0; index < input.length; index++) {
            arr[index] = Integer.parseInt(input[index]);
        }

        // Iterate over each element in arr using index i
        for (int i = 0; i < arr.length; i++) {
            // Iterate over each element in arr using index j
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue; // Skip if i equals j
                }
                // Iterate over each element in arr using index k
                for (int k = 0; k < arr.length; k++) {
                    // Check conditions
                    if (arr[k] != arr[j] && arr[k] != arr[i] && arr[k] == arr[i] + arr[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        return; // Exit program
                    }
                }
            }
        }

        // If no valid triplet is found
        System.out.println(-1);

        scanner.close();
    }
}

