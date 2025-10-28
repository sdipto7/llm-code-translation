
import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princessSpeed = scanner.nextInt();
        int dragonSpeed = scanner.nextInt();
        int tInitial = scanner.nextInt();
        int fTime = scanner.nextInt();
        int cThreshold = scanner.nextInt();
        scanner.close();

        if (dragonSpeed <= princessSpeed) {
            System.out.println(0);
            return;
        }

        double position = princessSpeed * tInitial;
        position += (princessSpeed * position) / (dragonSpeed - princessSpeed);
        int result = 0;

        while (position < cThreshold) {
            result++;
            position += (princessSpeed * position) / dragonSpeed;
            position += princessSpeed * fTime;
            position += (princessSpeed * position) / (dragonSpeed - princessSpeed);
        }

        System.out.println(result);
    }
}

