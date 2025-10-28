
public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNcr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt() - 1;
        }
        boolean noOne = true;
        for (int num : nums) {
            if (num == 0) {
                noOne = false;
                break;
            }
        }
        if (noOne) {
            for (int i = 0; i < n; i++) {
                nums[i] /= 2;
            }
        }
        boolean isOdd = false;
        for (int i = 0; i < n; i++) {
            if (!parityOfNcr(n - 1, i) && (nums[i] & 1) == 1) {
                isOdd = !isOdd;
            }
        }
        System.out.println(isOdd ? (noOne ? 2 : 1) : 0);
    }
}

