
import java.util.Scanner;

public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNCR(int n, int i) {
        int f = twosInFactorial(n);
        return f - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().trim().split(" ");
        int[] nums = new int[input.length];
        boolean noOne = true;
        for (int j = 0; j < input.length; j++) {
            nums[j] = Integer.parseInt(input[j]) - 1;
            if (nums[j] + 1 == 1) {
                noOne = false;
            }
        }
        if (noOne) {
            for (int j = 0; j < nums.length; j++) {
                nums[j] /= 2;
            }
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!parityOfNCR(n - 1, i) && (num & 1) == 1) {
                isOdd = !isOdd;
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

