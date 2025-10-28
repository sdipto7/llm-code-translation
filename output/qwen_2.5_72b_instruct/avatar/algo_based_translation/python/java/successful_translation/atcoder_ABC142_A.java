
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1 & 1) != 0) {
                t++;
            }
        }
        System.out.println((double) t / n);
    }

    public static int nextInt(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int[] nextInts(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}

