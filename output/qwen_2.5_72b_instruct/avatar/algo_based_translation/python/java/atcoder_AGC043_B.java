
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC043_B {
    public static int twos_in_factorial(int n) {
        String binary_representation = Integer.toBinaryString(n);
        int count_of_ones = 0;
        for (char c : binary_representation.toCharArray()) {
            if (c == '1') {
                count_of_ones++;
            }
        }
        return n - count_of_ones;
    }

    public static boolean parity_of_nCr(int n, int i) {
        int twos_in_n = twos_in_factorial(n);
        int twos_in_n_minus_i = twos_in_factorial(n - i);
        int twos_in_i = twos_in_factorial(i);
        return twos_in_n > twos_in_n_minus_i + twos_in_i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            nums.add(scanner.nextInt() - 1);
        }
        boolean no_one = false;
        if (!nums.contains(1)) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) / 2);
            }
            no_one = true;
        }
        boolean is_odd = false;
        for (int i = 0; i < nums.size(); i++) {
            if (!parity_of_nCr(n - 1, i) && (nums.get(i) & 1) == 1) {
                is_odd ^= true;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << (no_one ? 1 : 0));
        }
    }
}

