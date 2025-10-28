
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = nextInt(scanner);
        int t = 0;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                t++;
            }
        }
        
        System.out.println((double) t / n);
    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static int[] nextInts(Scanner scanner) {
        String[] inputs = scanner.nextLine().split(" ");
        int[] result = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            result[i] = Integer.parseInt(inputs[i]);
        }
        return result;
    }
}

