import java.util.Arrays;

public class s214672212 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1] * 10 + nums[nums.length - 2] + nums[nums.length - 3]);
    }
}
