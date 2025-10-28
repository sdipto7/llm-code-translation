
import java.util.Scanner;

public class s043174379 {
    public static int calculateArea(int H, int W, int h, int w) {
        int outerArea = H * W;
        int overlappingArea = h * W + w * H - h * w;
        int ans = outerArea - overlappingArea;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();
        
        int result = calculateArea(H, W, h, w);
        System.out.println(result);
    }
}

