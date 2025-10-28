
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class s214672212 {

    public static void main(String[] args) {
        calculateExpression();
    }

    public static void calculateExpression() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        Integer[] nums = new Integer[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        Arrays.sort(nums, Collections.reverseOrder());

        int result = nums[0] * 10 + nums[1] + nums[2];
        System.out.println(result);
    }
}

