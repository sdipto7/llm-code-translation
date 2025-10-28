
import java.util.Scanner;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] XS = new int[N];
        for (int i = 0; i < N; i++) {
            XS[i] = Integer.parseInt(input[i]);
        }

        int m = 999999999;
        for (int i = 1; i <= 100; i++) {
            int c = 0;
            for (int x : XS) {
                c += (x - i) * (x - i);
            }
            if (m > c) {
                m = c;
            }
        }

        System.out.println(m);
    }
}

