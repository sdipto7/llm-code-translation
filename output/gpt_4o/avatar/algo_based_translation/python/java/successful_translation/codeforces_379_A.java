
import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();

        // Initialize
        int s = 0;
        int restoSciolte = 0;

        // Loop
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }

        // Output
        System.out.println(s);

        scanner.close();
    }
}

