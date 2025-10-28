
import java.util.Scanner;

public class s752993784 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        int result = countDivisibleSubsequences(s);
        System.out.println(result);
    }

    public static int countDivisibleSubsequences(String s) {
        int[] countRemainder = new int[2019];
        int cnt = 0;
        int m = 1;
        int mod = 0;

        for (int i = 0; i < s.length(); i++) {
            mod += Character.getNumericValue(s.charAt(s.length() - i - 1)) * m;
            mod %= 2019;
            m *= 10;
            m %= 2019;
            countRemainder[mod]++;
        }

        countRemainder[0]++;

        for (int i = 0; i < 2019; i++) {
            cnt += countRemainder[i] * (countRemainder[i] - 1) / 2;
        }

        return cnt;
    }
}

