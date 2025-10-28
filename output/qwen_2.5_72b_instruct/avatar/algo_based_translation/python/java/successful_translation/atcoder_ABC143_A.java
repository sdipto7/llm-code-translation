import java.util.Scanner;

public class atcoder_ABC143_A {
    public static int calculateResult(int A, int B) {
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int result = calculateResult(A, B);
        System.out.println(result);
    }
}
