
import java.util.Scanner;

public class s615966179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);
        System.out.println(calculateResult(n, a, b));
    }

    public static int calculateResult(int n, int a, int b) {
        int ans = (n / (a + b)) * a;
        int r = Math.min(n % (a + b), a);
        ans += r;
        return ans;
    }
}

