
import java.util.Scanner;

public class codeforces_534_B {

    public static int calculateDistance(int v1, int v2, int t, int d) {
        int a = 1;
        int v = v1;
        int distance = 0;

        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a = -1;
                v = (t - i - 1) * d + v2;
            }
            distance += v;
            v += a * d;
        }

        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] velocityInput = scanner.nextLine().split(" ");
        int v1 = Integer.parseInt(velocityInput[0]);
        int v2 = Integer.parseInt(velocityInput[1]);

        String[] timeDistanceInput = scanner.nextLine().split(" ");
        int t = Integer.parseInt(timeDistanceInput[0]);
        int d = Integer.parseInt(timeDistanceInput[1]);

        int result = calculateDistance(v1, v2, t, d);
        System.out.println(result);

        scanner.close();
    }
}

