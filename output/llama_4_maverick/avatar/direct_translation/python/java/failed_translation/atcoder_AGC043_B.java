
public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNcr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() - 1;
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
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (noOne ? 1 : 0));
        }
    }
}

