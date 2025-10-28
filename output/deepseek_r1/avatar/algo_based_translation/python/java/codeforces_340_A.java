
import java.util.Scanner;

public class codeforces_340_A {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        int gcdValue = gcd(a, b);
        return (a * b) / gcdValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int a = Integer.parseInt(parts[2]);
        int b = Integer.parseInt(parts[3]);
        int lcmValue = lcm(x, y);
        int count = (b / lcmValue) - ((a - 1) / lcmValue);
        System.out.println(count);
        scanner.close();
    }
}

