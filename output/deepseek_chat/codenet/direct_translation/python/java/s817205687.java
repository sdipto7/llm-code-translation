
import java.util.Scanner;
import java.util.Arrays;

public class s817205687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() / 2;
        }

        int countDiv2 = -1;
        for (int a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (countDiv2 == -1) {
                countDiv2 = cnt;
            } else if (cnt != countDiv2) {
                System.out.println(0);
                return;
            }
        }

        int myLcm = lcmList(A);
        if (myLcm > M) {
            System.out.println(0);
            return;
        }

        int tmp = M / myLcm;
        int ans = (tmp + 1) / 2;
        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int lcmList(int[] numbers) {
        return Arrays.stream(numbers).reduce(1, (a, b) -> lcm(a, b));
    }
}

