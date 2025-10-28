import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static int main() {
        int[] input = LI();
        int a = input[0];
        int b = input[1];
        int c = input[2];
        int d = input[3];
        return Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c));
    }

    public static int[] LI() {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            result[i] = scanner.nextInt();
        }
        scanner.close();
        return result;
    }
}
