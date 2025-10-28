
import java.util.Scanner;

public class s661542483 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int count = 0;
        System.out.println(dfs(H));
    }

    private static int dfs(int h) {
        if (h == 1) {
            return 1;
        }
        return dfs(h / 2) * 2 + 1;
    }
}

