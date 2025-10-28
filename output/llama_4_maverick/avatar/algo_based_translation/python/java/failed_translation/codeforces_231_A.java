
import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(" ");
            int sum = 0;
            for (String num : input) {
                sum += Integer.parseInt(num);
            }
            if (sum > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

