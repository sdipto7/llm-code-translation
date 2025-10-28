
import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] l = scanner.nextLine().split(" ");
        double max = -1e9;
        double min = 1e9;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(l[i]);
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println((int)min + " " + (int)max + " " + sum);
        scanner.close();
    }
}

