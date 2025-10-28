
import java.util.Scanner;

public class s817205687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            A[i] /= 2;
        }

        Integer countDiv2 = null;
        for (int a : A) {
            int cnt = 0;
            int current = a;
            while (current % 2 == 0) {
                current /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
                countDiv2 = cnt;
            } else if (countDiv2 != cnt) {
                System.out.println(0);
                return;
            }
        }

        long myLcm = 1;
        for (int num : A) {
            myLcm = lcm(myLcm, num);
            if (myLcm > M) {
                break;
            }
        }

        if (myLcm > M) {
            System.out.println(0);
            return;
        }

        long tmp = M / myLcm;
        long ans = (tmp + 1) / 2;
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}

