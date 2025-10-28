
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Read and discard the first line of input
        String[] input = scanner.nextLine().split(" ");
        int[] a = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        boolean anyNotDivisible = false;
        for (int x : a) {
            if (x % a[0] != 0) {
                anyNotDivisible = true;
                break;
            }
        }
        System.out.println(anyNotDivisible ? a[0] : -1);
    }
}

