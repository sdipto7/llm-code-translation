
import java.util.Arrays;
import java.util.Scanner;

public class s214672212 {
    public static int processInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);
        int temp;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        int result = nums[0] * 10 + nums[1] + nums[2];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(processInput());
    }
}

