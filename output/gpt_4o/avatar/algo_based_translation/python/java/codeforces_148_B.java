
import java.util.Scanner;

public class codeforces_148_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(calculateAttempts(princess, dragon, t, f, c));
    }

    public static int calculateAttempts(int princess, int dragon, int t, int f, int c) {
        if (dragon <= princess) {
            System.out.println(0);
            return 0;
        }

        int result = 0;
        double position = t * princess;
        position += princess * position / (double)(dragon - princess);

        while (position < c) {
            result++;
            position += princess * position / (double)dragon;
            position += princess * f;
            position += princess * position / (double)(dragon - princess);
        }

        return result;
    }
}

