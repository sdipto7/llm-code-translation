
import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] nums = new long[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextLong();
        }
        String[] operations = new String[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }
        long[] ans = { Long.MAX_VALUE };
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
        scanner.close();
    }

    private static void rememberTheNumber(long[] nums, int i, String[] operations, long[] ans) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    long s = nums[j];
                    nums[j] = -1;
                    long t = nums[k];
                    if (operations[i].equals("+")) {
                        nums[k] = s + t;
                    } else if (operations[i].equals("*")) {
                        nums[k] = s * t;
                    }
                    if (i == 2) {
                        ans[0] = Math.min(ans[0], nums[k]);
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}

