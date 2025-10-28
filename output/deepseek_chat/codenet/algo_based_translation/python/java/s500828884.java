import java.util.Scanner;

public class s500828884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cost1 = n * a;
        int cost2 = b;
        int result = Math.min(cost1, cost2);
        System.out.println(result);
    }
}
