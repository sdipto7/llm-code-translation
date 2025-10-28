
import java.util.Arrays;
import java.util.Scanner;

public class s683277023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] li = new int[n];
        String[] nums = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            li[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(li);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li[i];
        }
        System.out.println(sum);
    }
}

