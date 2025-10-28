
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int x = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
        int y = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
        int z = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}

