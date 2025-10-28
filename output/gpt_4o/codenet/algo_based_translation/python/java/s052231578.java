
import java.util.Scanner;
import java.util.Arrays;

public class s052231578 {

    public static int findSmallest111Multiple(int N) {
        int[] arr = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        int ansIdx = Arrays.binarySearch(arr, N);
        if (ansIdx < 0) {
            ansIdx = -ansIdx - 1;
        }
        return arr[ansIdx];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = findSmallest111Multiple(N);
        System.out.println(result);
    }
}

