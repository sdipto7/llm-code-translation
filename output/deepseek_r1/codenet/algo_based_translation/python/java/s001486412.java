
import java.util.Scanner;

public class s001486412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().trim().split("\\s+");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        double below = 0.0;
        for (int i = 0; i < n; i++) {
            below += 1.0 / a[i];
        }
        System.out.println(1.0 / below);
    }
}

