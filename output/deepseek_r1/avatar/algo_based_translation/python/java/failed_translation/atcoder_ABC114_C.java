
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC114_C {
    private static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int result = aaa("0");
        System.out.println(result);
    }

    private static int aaa(String n) {
        int currentNum = Integer.parseInt(n);
        if (currentNum > N) {
            return 0;
        }

        String numStr = Integer.toString(currentNum);
        Set<Character> digits = new HashSet<>();
        for (char c : numStr.toCharArray()) {
            digits.add(c);
        }

        int ans = (digits.contains('7') && digits.contains('5') && digits.contains('3') && digits.size() == 3) ? 1 : 0;

        for (char digit : new char[]{'7', '5', '3'}) {
            String newN = n + digit;
            ans += aaa(newN);
        }

        return ans;
    }
}

