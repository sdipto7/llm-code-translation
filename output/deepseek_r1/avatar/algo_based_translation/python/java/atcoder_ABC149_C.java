
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        boolean[] prime = new boolean[100010];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }

        for (int i = 3; i * i <= 100008; i += 2) {
            if (prime[i]) {
                for (int j = i * 2; j < 100008; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = X; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}

