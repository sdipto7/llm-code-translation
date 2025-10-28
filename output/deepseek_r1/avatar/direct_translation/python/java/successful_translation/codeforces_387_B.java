
import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[] roundComplexity = new int[n];
        String[] roundLine = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = Integer.parseInt(roundLine[i]);
        }

        int[] georgeComplexity = new int[m];
        String[] georgeLine = sc.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = Integer.parseInt(georgeLine[i]);
        }

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (roundComplexity[i] <= georgeComplexity[j]) {
                i++;
            }
            j++;
        }
        System.out.println(n - i);
    }
}

