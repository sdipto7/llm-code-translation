
import java.util.Scanner;

public class codeforces_379_A {
    public static int calculateBurnedCandles(int candeleIntere, int b) {
        int s = 0;
        int restoSciolte = 0;
        
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            
            s += candeleIntere;
            
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialCandles = scanner.nextInt();
        int requiredStubs = scanner.nextInt();
        System.out.println(calculateBurnedCandles(initialCandles, requiredStubs));
        scanner.close();
    }
}

