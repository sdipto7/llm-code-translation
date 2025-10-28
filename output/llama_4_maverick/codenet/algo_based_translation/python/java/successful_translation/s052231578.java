
import java.util.Arrays;
import java.util.Scanner;

public class s052231578 {
    public static void main(String[] args) {
        int N = readInput();
        int[] arr = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        int ans_idx = findInsertionPoint(arr, N);
        System.out.println(arr[ans_idx]);
    }

    private static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int findInsertionPoint(int[] arr, int N) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < N) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

