
import java.util.Scanner;

public class s122565091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, v, b, w, t;
        String[] line1 = scanner.nextLine().split(" ");
        a = Integer.parseInt(line1[0]);
        v = Integer.parseInt(line1[1]);
        String[] line2 = scanner.nextLine().split(" ");
        b = Integer.parseInt(line2[0]);
        w = Integer.parseInt(line2[1]);
        t = Integer.parseInt(scanner.nextLine());
        System.out.println(canCatch(a, v, b, w, t));
    }

    public static String canCatch(int a, int v, int b, int w, int t) {
        if (a == b) {
            return "YES";
        } else if (v <= w) {
            return "NO";
        } else {
            double timeToCatch = Math.abs((double) (a - b)) / (v - w);
            if (t < timeToCatch) {
                return "NO";
            } else {
                return "YES";
            }
        }
    }
}

