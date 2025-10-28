
import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String v = scanner.nextLine();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < m; i++) {
            output.append(d[f ? 1 : 0]).append("\n");
        }
        String str = f ? new StringBuilder(v).reverse().toString() : v;
        for (char c : str.toCharArray()) {
            output.append("PRINT ").append(c).append("\n");
            output.append(d[f ? 1 : 0]).append("\n");
        }
        System.out.print(output.toString().trim());
    }
}

