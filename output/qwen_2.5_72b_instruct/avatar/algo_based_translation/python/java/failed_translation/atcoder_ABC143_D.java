
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = binarySearchLeft(l, a + b);
                int left = binarySearchRight(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if (left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }

    private static int binarySearchLeft(int[] arr, int key) {
        int index = Arrays.binarySearch(arr, key);
        if (index < 0) {
            return -index - 1;
        }
        while (index > 0 && arr[index - 1] == key) {
            index--;
        }
        return index;
    }

    private static int binarySearchRight(int[] arr, int key) {
        int index = Arrays.binarySearch(arr, key);
        if (index < 0) {
            return -index - 1;
        }
        while (index < arr.length - 1 && arr[index + 1] == key) {
            index++;
        }
        return index + 1;
    }
}

