
import java.util.Scanner;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int[] XS = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            XS[i] = Integer.parseInt(parts[i]);
        }
        long min = Long.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            long sum = 0;
            for (int x : XS) {
                sum += (x - i) * (x - i);
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min);
    }
}

