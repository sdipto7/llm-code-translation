
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] nums = scanner.nextLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}

