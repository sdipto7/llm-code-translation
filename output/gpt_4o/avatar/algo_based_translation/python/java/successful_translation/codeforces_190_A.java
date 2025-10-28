
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_190_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        
        Object result = calculateMinMax(n, m);
        if (result instanceof String) {
            System.out.println((String) result);
        } else {
            int[] minMax = (int[]) result;
            System.out.println(minMax[0] + " " + minMax[1]);
        }
    }

    public static Object calculateMinMax(int n, int m) {
        if (n < 1) {
            if (m < 1) {
                return new int[]{n, m};
            }
            return "Impossible";
        }
        int min, max;
        if (m > n) {
            min = m;
            max = n + m - 1;
            return new int[]{min, max};
        } else {
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            return new int[]{min, max};
        }
    }
}

