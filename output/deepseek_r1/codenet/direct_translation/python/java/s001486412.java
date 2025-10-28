
import java.util.Scanner;

public class s001486412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        double below = 0.0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(parts[i]);
            below += 1.0 / num;
        }
        System.out.println(1.0 / below);
    }
}

