
import java.util.Scanner;

public class s664563518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] s = new String[N];
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            s[i] = input[0];
            t[i] = Integer.parseInt(input[1]);
        }

        String X = scanner.nextLine();
        int xi = 0;

        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                xi = i;
                break;
            }
        }

        int ans = 0;

        for (int i = xi + 1; i < N; i++) {
            ans += t[i];
        }

        System.out.println(ans);
    }
}

