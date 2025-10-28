
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNcr(int n, int i) {
        int totalTwos = twosInFactorial(n);
        int denominatorTwos = twosInFactorial(n - i) + twosInFactorial(i);
        return (totalTwos - denominatorTwos) > 0;
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
        
        boolean noOne = false;
        if (!nums.contains(1)) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) / 2);
            }
            noOne = true;
        }
        
        boolean isOdd = false;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (!parityOfNcr(n - 1, i) && (num & 1) != 0) {
                isOdd ^= true;
            }
        }
        
        System.out.println(isOdd ? (1 << (noOne ? 1 : 0)) : 0);
    }
}

