
import java.util.Scanner;

public class s500828884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int result = calculateMinCost(n, a, b);
        printResult(result);
    }

    public static int calculateMinCost(int n, int a, int b) {
        return Math.min(n * a, b);
    }

    public static void printResult(int result) {
        System.out.println(result);
    }
}

