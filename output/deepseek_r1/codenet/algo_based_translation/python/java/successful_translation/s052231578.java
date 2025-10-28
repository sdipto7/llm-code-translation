
import java.util.Arrays;
import java.util.Scanner;

public class s052231578 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        int result = Arrays.binarySearch(arr, N);
        int ansIdx = result >= 0 ? result : -result - 1;
        System.out.println(arr[ansIdx]);
    }
}

