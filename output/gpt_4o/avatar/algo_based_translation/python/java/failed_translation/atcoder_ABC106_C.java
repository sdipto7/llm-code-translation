
import java.util.Scanner;

public class atcoder_ABC106_C {
    static final int inf = (int) Math.pow(10, 20);
    static final double eps = 1.0 / Math.pow(10, 10);
    static final int mod = (int) (Math.pow(10, 9) + 7);
    static final int[][] dd = { {-1, 0}, {0, 1}, {1, 0}, {0, -1} };
    static final int[][] ddn = { {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1} };

    public static void main(String[] args) {
        System.out.println(mainProcess());
    }

    private static int[] LI(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }

    private static int[] LI_(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]) - 1;
        }
        return result;
    }

    private static double[] LF(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        double[] result = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Double.parseDouble(input[i]);
        }
        return result;
    }

    private static String[] LS(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }

    private static int I(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static double F(Scanner scanner) {
        return Double.parseDouble(scanner.nextLine());
    }

    private static String S(Scanner scanner) {
        return scanner.nextLine();
    }

    private static void pf(String s) {
        System.out.println(s);
    }

    private static Object mainProcess() {
        Scanner scanner = new Scanner(System.in);
        String s = S(scanner);
        int k = I(scanner);
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            return 1;
        }
        return s.charAt(l);
    }
}

