
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];
        for (int i = 0; i < x; i++) a[i] = scanner.nextInt();
        for (int i = 0; i < y; i++) b[i] = scanner.nextInt();
        for (int i = 0; i < z; i++) c[i] = scanner.nextInt();
        int[] ab = new int[x * y];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[index++] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        reverse(ab);
        int[] abc = new int[Math.min(k, x * y) * z];
        index = 0;
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[index++] = ab[i] + c[j];
            }
        }
        Arrays.sort(abc);
        reverse(abc);
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
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
}

