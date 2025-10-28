
import java.util.*;

public class atcoder_AGC043_B {
    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }
    
    public static boolean parityOfNcr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputNums = scanner.nextLine().trim().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String numStr : inputNums) {
            nums.add(Integer.parseInt(numStr) - 1);
        }
        
        boolean noOne = false;
        if (!nums.contains(1)) {
            List<Integer> newNums = new ArrayList<>();
            for (int num : nums) {
                newNums.add(num / 2);
            }
            nums = newNums;
            noOne = true;
        }
        
        boolean isOdd = false;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (!parityOfNcr(n - 1, i) && num % 2 == 1) {
                isOdd ^= true;
            }
        }
        
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(noOne ? 2 : 1);
        }
    }
}

