import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNCR(int n, int i) {
        int f = twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i);
        return f > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputNums = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String num : inputNums) {
            nums.add(Integer.parseInt(num) - 1);
        }
        boolean noOne = !nums.contains(1);
        if (noOne) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) / 2);
            }
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.size(); i++) {
            if (!parityOfNCR(n - 1, i) && (nums.get(i) & 1) == 1) {
                isOdd ^= true;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (noOne ? 1 : 0));
        }
    }
}
