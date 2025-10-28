
import java.util.Scanner;

public class s043174379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int H = Integer.parseInt(firstLine[0]);
        int W = Integer.parseInt(firstLine[1]);
        String[] secondLine = scanner.nextLine().split(" ");
        int h = Integer.parseInt(secondLine[0]);
        int w = Integer.parseInt(secondLine[1]);
        System.out.println(calculateRemainingArea(H, W, h, w));
    }

    public static int calculateRemainingArea(int H, int W, int h, int w) {
        return H * W - (h * W + w * H - h * w);
    }
}

