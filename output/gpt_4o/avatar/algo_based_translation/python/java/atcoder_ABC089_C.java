
import java.util.*;
import java.io.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer N from the input
        int N = Integer.parseInt(scanner.nextLine());

        // Read N strings from the input and store them in a list S
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextLine());
        }

        // Define a list of characters representing the initials M, A, R, C, H
        char[] march = {'M', 'A', 'R', 'C', 'H'};

        // Initialize a list of size 5 to count the occurrences of each initial
        int[] marchLis = new int[5];

        // Iterate over each string in S
        for (String s : S) {
            // Check if the first character of the string (case insensitive) is in the list 'march'
            char firstChar = Character.toUpperCase(s.charAt(0));
            for (int i = 0; i < march.length; i++) {
                if (firstChar == march[i]) {
                    // Increment the count for the corresponding initial in 'marchLis'
                    marchLis[i]++;
                    break;
                }
            }
        }

        // Initialize a variable to store the final answer
        long ans = 0;

        // Iterate over all combinations of three different initials from 'marchLis'
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    // Calculate the number of possible combinations by multiplying the counts of the three initials
                    ans += (long) marchLis[i] * marchLis[j] * marchLis[k];
                }
            }
        }

        // Output the final result
        System.out.println(ans);
    }
}

