
import java.util.Scanner;

public class atcoder_ARC086_B {
    private static int mySign(int x) {
        if (x > 0) return 1;
        if (x < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;

        for (int i = 0; i < N; i++) {
            int absVal = Math.abs(a[i]);
            if (absVal > maxVal) {
                maxVal = absVal;
                maxSign = mySign(a[i]);
                maxIndex = i;
            }
        }

        if (maxSign == 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * N - 1);
            
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            
            if (maxSign == 1) {
                for (int i = 0; i < N - 1; i++) {
                    System.out.println((i + 1) + " " + (i + 2));
                }
            } else {
                for (int i = N - 1; i >= 1; i--) {
                    System.out.println((i + 1) + " " + i);
                }
            }
        }
        scanner.close();
    }
}

