
import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];

        String[] line2 = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = Integer.parseInt(line2[i]);
        }

        String[] line3 = scanner.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = Integer.parseInt(line3[i]);
        }

        int i = 0, j = 0;
        while (i < n && j < m) {
            i += (roundComplexity[i] <= georgeComplexity[j]) ? 1 : 0;
            j++;
        }
        System.out.println(n - i);
    }
}

