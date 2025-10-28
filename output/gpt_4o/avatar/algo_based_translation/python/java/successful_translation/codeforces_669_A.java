
import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        System.out.println(calculateExpression());
    }

    public static int calculateExpression() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return (n * 2 + 1) / 3;
    }
}

