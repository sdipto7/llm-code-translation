
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) {
                t++;
            }
        }
        System.out.println((double) t / n);
    }

    public static int nextInt(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int[] nextInts(Scanner scanner) {
        String[] strs = scanner.nextLine().split(" ");
        int[] ints = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
        return ints;
    }
}

