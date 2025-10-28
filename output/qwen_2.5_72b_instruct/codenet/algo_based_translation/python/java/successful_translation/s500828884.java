
import java.util.Scanner;

public class s500828884 {
    public static int calculateMinimumCost(int n, int a, int b) {
        return Math.min(n * a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int cost = calculateMinimumCost(n, a, b);
        System.out.println(cost);
    }
}

