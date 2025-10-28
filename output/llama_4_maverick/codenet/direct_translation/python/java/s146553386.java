
import java.util.Scanner;

public class s146553386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < n; i++) {
            a[0][i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[1][i] = scanner.nextInt();
        }
        reverse(a[1]);
        long[] res_0 = cumulativeSum(a[0]);
        long[] res_1 = cumulativeSum(a[1]);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long check = res_0[i] + res_1[n - 1 - i];
            ans = Math.max(ans, check);
        }
        System.out.println(ans);
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static long[] cumulativeSum(int[] array) {
        long[] cumulativeSum = new long[array.length];
        cumulativeSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + array[i];
        }
        return cumulativeSum;
    }
}

