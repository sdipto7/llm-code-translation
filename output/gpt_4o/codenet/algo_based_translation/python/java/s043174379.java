
import java.util.Scanner;

public class s043174379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of the larger rectangle
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        // Read dimensions of the smaller rectangle
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        // Calculate remaining area
        int ans = H * W - (h * W + w * H - h * w);

        // Output the result
        System.out.println(ans);

        scanner.close();
    }
}

