import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class s214672212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrings = scanner.nextLine().split(" ");
        Integer[] nums = new Integer[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            nums[i] = Integer.parseInt(inputStrings[i]);
        }
        Arrays.sort(nums, Collections.reverseOrder());
        int result = nums[0] * 10 + nums[1] + nums[2];
        System.out.println(result);
    }
}
