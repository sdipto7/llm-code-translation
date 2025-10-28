
import java.util.Scanner;

public class s423256012 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int sum = A + B;
        if (sum % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(sum / 2);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}

