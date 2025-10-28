
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_302_A {

    public static String processInput(int n, int m, String s, List<int[]> queries) {
        // Step 1: Calculate the number of '-' characters in the input string `s`
        int sa = (int) s.chars().filter(ch -> ch == '-').count();

        // Step 2: Determine the minimum number of '-' or 'non-' characters
        sa = Math.min(n - sa, sa);

        // Step 3: Initialize an empty list to store the results
        StringBuilder ss = new StringBuilder();

        // Step 4: Iterate over each query
        for (int i = 0; i < m; i++) {
            int[] query = queries.get(i);
            int a = query[0];
            int b = query[1];

            // Step 5: Calculate the difference `b - a`
            b -= a;

            // Step 6: Determine the result based on conditions
            if (b % 2 == 1 && b <= sa * 2) {
                ss.append("1\n");
            } else {
                ss.append("0\n");
            }
        }

        // Step 7: Return the concatenated results as a string
        return ss.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read and parse the first line of input (n and m)
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Step 2: Read the second line of input (string s)
        String s = scanner.nextLine();

        // Step 3: Initialize a list to store all queries
        List<int[]> queries = new ArrayList<>();

        // Step 4: Read the next `m` lines of input (queries)
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            queries.add(new int[]{a, b});
        }
        scanner.close();

        // Step 5: Process the input and get the output
        String result = processInput(n, m, s, queries);

        // Step 6: Print the result
        System.out.print(result);
    }
}

