
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int tcs = 1;
        int tc = 1;
        Scanner scanner = new Scanner(System.in);
        while (tc <= tcs) {
            int a = scanner.nextInt();
            System.out.println(a == 0 ? 1 : 0);
            tc += 1;
        }
        scanner.close();
    }
}

