
import java.util.Scanner;
public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += sc.nextInt();
            }
            if (sum > 1) {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}

