
import java.util.Scanner;

public class s664563518 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read integer N
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Initialize arrays
        String[] s = new String[N];
        int[] t = new int[N];

        // Read input pairs and populate arrays
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
            sc.nextLine(); // Consume the newline
        }

        // Read string X
        String X = sc.nextLine();

        // Find index xi where s[xi] equals X
        int xi = 0;
        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                xi = i;
                break;
            }
        }

        // Calculate answer
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (xi < i) {
                ans += t[i];
            }
        }

        // Print the result
        System.out.println(ans);
        
        sc.close();
    }
}

