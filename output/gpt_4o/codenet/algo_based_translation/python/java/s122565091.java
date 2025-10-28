
import java.util.Scanner;

public class s122565091 {

    public static String canCatchUp(int a, int v, int b, int w, int t) {
        if (a == b) {
            return "YES";
        } else if (v <= w) {
            return "NO";
        } else {
            double timeRequired = Math.abs(a - b) / (double)(v - w);
            if (t < timeRequired) {
                return "NO";
            } else {
                return "YES";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int v = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int t = scanner.nextInt();

        String result = canCatchUp(a, v, b, w, t);
        System.out.println(result);

        scanner.close();
    }
}

