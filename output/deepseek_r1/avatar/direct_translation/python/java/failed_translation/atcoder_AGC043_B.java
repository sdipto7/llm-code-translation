
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC043_B {

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNCR(int n, int i) {
        int a = twosInFactorial(n);
        int b = twosInFactorial(n - i);
        int c = twosInFactorial(i);
        return (a - b - c) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] parts = scanner.nextLine().trim().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String part : parts) {
            nums.add(Integer.parseInt(part) - 1);
        }

        boolean hasOne = false;
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
                break;
            }
        }
        boolean noOne = false;
        if (!hasOne) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) / 2);
            }
            noOne = true;
        }

        boolean isOdd = false;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (!parityOfNCR(n - 1, i) && (num % 2 != 0)) {
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

