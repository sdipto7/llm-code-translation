import java.util.*;
public class s214672212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);
        int result = nums[nums.length - 1] * 10 + nums[nums.length - 2] + nums[nums.length - 3];
        System.out.println(result);
    }
}
