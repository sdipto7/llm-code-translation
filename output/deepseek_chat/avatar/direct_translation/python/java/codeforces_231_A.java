
import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int sum = 0;
            for (String s : input) {
                sum += Integer.parseInt(s);
            }
            if (sum > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}

