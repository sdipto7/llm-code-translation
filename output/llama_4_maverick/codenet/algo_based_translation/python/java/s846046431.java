
import java.util.Arrays;
import java.util.Scanner;

public class s846046431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        reverseArray(A);
        int S = 0;
        for (int a : A) {
            S += a;
        }
        for (int i = 0; i < M; i++) {
            if ((double)A[i]/S - 1.0/(4*M) < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
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

