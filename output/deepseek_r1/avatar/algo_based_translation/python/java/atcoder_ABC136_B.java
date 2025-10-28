
import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long ans = 0;
        long currentPower = 10;

        while (currentPower <= N) {
            ans += currentPower - (currentPower / 10);
            currentPower *= 100;
        }

        long lastPower = currentPower / 10;
        ans += Math.max(0, N - lastPower + 1);
        
        System.out.println(ans);
    }
}

