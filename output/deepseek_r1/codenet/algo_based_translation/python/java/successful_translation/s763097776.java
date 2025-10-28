
import java.util.Scanner;
import java.util.Arrays;

public class s763097776 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] p = new int[n];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(input[i]);
        }
        int[] pCopy = Arrays.copyOf(p, p.length);
        Arrays.sort(p);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] != pCopy[i]) {
                count++;
            }
        }
        if (count == 0 || count == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

