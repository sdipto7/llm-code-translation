
import java.util.Scanner;

public class atcoder_AGC043_B {

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNCr(int n, int i) {
        int f_n = twosInFactorial(n);
        int f_n_i = twosInFactorial(n - i);
        int f_i = twosInFactorial(i);
        return f_n - f_n_i - f_i > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().trim().split(" ");
        int[] nums = new int[input.length];
        for (int j = 0; j < input.length; j++) {
            nums[j] = Integer.parseInt(input[j]) - 1;
        }

        boolean noOne = false;
        boolean isOdd = false;

        boolean oneFound = false;
        for (int num : nums) {
            if (num == 1) {
                oneFound = true;
                break;
            }
        }

        if (!oneFound) {
            for (int j = 0; j < nums.length; j++) {
                nums[j] /= 2;
            }
            noOne = true;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!parityOfNCr(n - 1, i) && (num & 1) == 1) {
                isOdd ^= true;
            }
        }

        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (noOne ? 1 : 0));
        }

        scanner.close();
    }
}

