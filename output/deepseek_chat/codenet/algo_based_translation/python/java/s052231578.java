
import java.util.Arrays;
import java.util.Scanner;

public class s052231578 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        int ans_idx = Arrays.binarySearch(arr, N);
        if (ans_idx < 0) {
            ans_idx = -ans_idx - 1;
        }
        System.out.println(arr[ans_idx]);
    }
}

