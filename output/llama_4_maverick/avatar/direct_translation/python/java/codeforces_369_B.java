
import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        int l = Integer.parseInt(inputs[2]);
        int r = Integer.parseInt(inputs[3]);
        int sa = Integer.parseInt(inputs[4]);
        int sk = Integer.parseInt(inputs[5]);
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
        int[] result = new int[num];
        int quotient = t / num;
        int remainder = t % num;
        for (int i = 0; i < num; i++) {
            result[i] = (i < remainder) ? quotient + 1 : quotient;
        }
        return result;
    }
}

