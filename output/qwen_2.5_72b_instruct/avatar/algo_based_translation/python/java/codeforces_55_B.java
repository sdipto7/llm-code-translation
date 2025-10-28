import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_55_B {
    public static void rememberTheNumber(List<Integer> nums, int i, List<String> operations, List<Integer> ans) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 3; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums.get(j) != -1 && nums.get(k) != -1) {
                    int s = nums.get(j);
                    nums.set(j, -1);
                    int t = nums.get(k);
                    if (operations.get(i).equals("+")) {
                        nums.set(k, s + t);
                    } else if (operations.get(i).equals("*")) {
                        nums.set(k, s * t);
                    }
                    if (i == 2 && nums.get(k) < ans.get(0)) {
                        ans.set(0, nums.get(k));
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
                    nums.set(j, s);
                    nums.set(k, t);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        for (String num : scanner.nextLine().split(" ")) {
            nums.add(Integer.parseInt(num));
        }
        List<String> operations = new ArrayList<>();
        for (String operation : scanner.nextLine().split(" ")) {
            operations.add(operation);
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(10000000000000000000000000);
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans.get(0));
    }
}
