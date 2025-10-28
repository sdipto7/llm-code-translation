
import java.util.Scanner;

public class s353603279 {

    public static int calculateTotalReward(int x) {
        int h = x / 500;
        int a = (x % 500) / 5;
        int y = h * 1000 + a * 5;
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int reward = calculateTotalReward(x);
        System.out.println(reward);
        scanner.close();
    }
}

