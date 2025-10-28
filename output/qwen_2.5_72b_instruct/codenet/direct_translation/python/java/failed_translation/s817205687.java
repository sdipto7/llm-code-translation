
import java.util.Arrays;
import java.util.Scanner;

public class s817205687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt() / 2;
        }

        Integer countDiv2 = null;
        for (int a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
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

    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static int lcmList(int[] numbers) {
        return Arrays.stream(numbers).reduce(1, Main::lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

