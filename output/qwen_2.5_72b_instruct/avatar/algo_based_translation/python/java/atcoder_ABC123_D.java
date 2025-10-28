import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int z = Integer.parseInt(input[2]);
        int k = Integer.parseInt(input[3]);

        input = scanner.nextLine().split(" ");
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        input = scanner.nextLine().split(" ");
        int[] b = new int[y];
        for (int i = 0; i < y; i++) {
            b[i] = Integer.parseInt(input[i]);
        }

        input = scanner.nextLine().split(" ");
        int[] c = new int[z];
        for (int i = 0; i < z; i++) {
            c[i] = Integer.parseInt(input[i]);
        }

        int[] ab = new int[x * y];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[index++] = a[i] + b[j];
            }
        }

        Arrays.sort(ab);
        reverseArray(ab);

        int[] abc = new int[Math.min(k, x * y) * z];
        index = 0;
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[index++] = ab[i] + c[j];
            }
        }

        Arrays.sort(abc);
        reverseArray(abc);

        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }

        scanner.close();
    }

    public static void reverseArray(int[] array) {
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
