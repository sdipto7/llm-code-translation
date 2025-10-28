
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class atcoder_AGC043_B {
    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parity_of_nCr(int n, int i) {
        int f = twos_in_factorial(n) - twos_in_factorial(n - i) - twos_in_factorial(i);
        return f > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = scanner.nextLine().trim().split(" ").stream().map(Integer::parseInt).map(x -> x - 1).collect(Collectors.toList());
        boolean no_one = !nums.contains(1);
        if (no_one) {
            nums = nums.stream().map(num -> num / 2).collect(Collectors.toList());
        }
        boolean is_odd = false;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (!parity_of_nCr(n - 1, i) && (num & 1) != 0) {
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

