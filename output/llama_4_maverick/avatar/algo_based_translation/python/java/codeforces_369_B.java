
import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = getNums(k, sk);
        int[] temp = getNums(n - k, sa - sk);
        int[] result = new int[n];
        System.arraycopy(ans, 0, result, 0, k);
        System.arraycopy(temp, 0, result, k, n - k);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] getNums(int num, int t) {
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                list[i] = t / num + 1;
            } else {
                list[i] = t / num;
            }
        }
        return list;
    }
}

