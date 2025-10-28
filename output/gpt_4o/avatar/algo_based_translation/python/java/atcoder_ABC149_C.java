
import java.util.Scanner;

public class atcoder_ABC149_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();
        
        boolean[] prime = new boolean[100010];
        
        // Initialization
        for (int i = 0; i < 100010; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        
        // Mark non-prime even numbers
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        
        // Sieve of Eratosthenes for odd numbers
        for (int i = 3; i * i <= 100008; i += 2) {
            if (prime[i]) {
                for (int j = i + i; j < 100008; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        // Find smallest prime number greater than or equal to X
        for (int i = X; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}

