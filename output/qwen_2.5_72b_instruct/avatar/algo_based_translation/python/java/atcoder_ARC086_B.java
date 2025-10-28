
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ARC086_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int N = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(scanner.nextInt());
        }
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < N; i++) {
            int a0 = a.get(i);
            if (Math.abs(a0) > max_val) {
                max_val = Math.abs(a0);
                max_sign = Integer.signum(a0);
                max_index = i;
            }
        }
        if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i >= 1; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
        scanner.close();
    }
}

