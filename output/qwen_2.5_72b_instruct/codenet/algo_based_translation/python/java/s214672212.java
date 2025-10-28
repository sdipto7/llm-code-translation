
import java.util.Arrays;
import java.util.Scanner;

public class s214672212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(nums);
        int result = nums[nums.length - 1] * 10 + nums[nums.length - 2] + nums[nums.length - 3];
        System.out.println(result);
        scanner.close();
    }
}

