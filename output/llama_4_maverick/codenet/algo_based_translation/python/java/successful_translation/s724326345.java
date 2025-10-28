
import java.util.Scanner;

public class s724326345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int X = Integer.parseInt(input[3]);
        int Y = Integer.parseInt(input[4]);

        long ans = (long) Math.pow(10, 10);

        for (int k = 0; k <= Math.max(X, Y); k++) {
            long total = 2L * C * k + (long) A * Math.max(0, X - k) + (long) B * Math.max(0, Y - k);
            if (total < ans) {
                ans = total;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}

