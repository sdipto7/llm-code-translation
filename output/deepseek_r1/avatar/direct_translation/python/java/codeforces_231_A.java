
import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            int sum = 0;
            for (String num : parts) {
                sum += Integer.parseInt(num);
            }
            if (sum > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}

